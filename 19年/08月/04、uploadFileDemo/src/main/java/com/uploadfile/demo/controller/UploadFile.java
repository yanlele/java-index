package com.uploadfile.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/api")
public class UploadFile {

    // 文件上传
    @PostMapping("/upload")
    public void uploadFile(
            @RequestParam("myfile") MultipartFile file,
            MultipartHttpServletRequest request
    ) throws IOException {
        System.out.println("上传文件");
        if (request.getContentLength() > 0) {
            String fileName = file.getOriginalFilename();
            InputStream inputStream = null;
            inputStream = file.getInputStream();

            System.out.println(inputStream);
            // todo
        }
    }




}
