package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @Author:DENG-
 * @Date:2019/11/20 14:48
 */
@Controller
public class FileController {
    public static final String FILE_DIRECTORY = "H://1";

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String dologin(String username, String password, HttpSession session){
        if("admin".equals(username) && "123".equals(password)){
            session.setAttribute("username",username);
            return "index";
        }else {
            return "login";
        }
    }

    @RequestMapping("/upload")
    public String upload(MultipartFile myFile){
        String filename = myFile.getOriginalFilename();
        String path = FILE_DIRECTORY + File.separator + filename;
        File file = new File(path);
        try {
            myFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> download(String filename) throws IOException {
        String fullPath = FILE_DIRECTORY + File.separator + filename;
        File file = new File(fullPath);

        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if(mediaType == null){
            mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType(mediaType));
        httpHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(filename,"UTF-8"));

        InputStreamResource isr = new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(isr,httpHeaders, HttpStatus.OK);
    }
}
