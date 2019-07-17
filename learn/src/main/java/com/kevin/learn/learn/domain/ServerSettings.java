package com.kevin.learn.learn.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:服务器配置 配置了前缀或者不配置只要是配置文件和写的名字一样的话 是不需要@Value映射的
 * @Author: Kevin
 * @Create 2019-07-17 15:10
 */
@Data
@Component
@PropertySource({"classpath:application.properties"})
@ConfigurationProperties(prefix = "test")
public class ServerSettings {
    //    @Value("${appname}")
    private String name;
    //    @Value("${domain}")
    private String domain;
}
