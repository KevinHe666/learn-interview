package com.kevin.learn.learn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-16 17:34
 */
@Controller
@PropertySource({"classpath:application.properties"})
public class FileController {
    /**
     * 不要硬编码 都配置好文件
     */
    @Value("${web.file.path}")
    private String filePath;

    @RequestMapping(value = "upload")
    @ResponseBody
    public String upload(@RequestParam("head_img") MultipartFile file, HttpServletRequest request) {

        String name = request.getParameter("name");
        String intern = name.intern();
        System.out.println(intern);
        System.out.println("用户名:" + name);
        //获取文件名
        String fileName = file.getOriginalFilename();
        System.out.println("上传的文件名是: " + fileName);
        System.out.println("上传的文件名是: " + fileName);

        //获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        System.out.println("上传的后缀名是: " + suffixName);

        //文件上传的路径
        fileName = UUID.randomUUID() + suffixName;
        System.out.println("转换后的名称: " + fileName);
        File dest = new File(filePath + fileName);

        try {
            file.transferTo(dest);
            return fileName;
        } catch (IllegalThreadStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
