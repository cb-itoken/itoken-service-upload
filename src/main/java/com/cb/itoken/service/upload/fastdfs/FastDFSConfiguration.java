package com.cb.itoken.service.upload.fastdfs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:congbing
 * @Description Java 配置方式定义 StorageFactory 的 Bean 使其可以被依赖注入
 * @Date: 20:06 2019/1/30
 **/
@Configuration
public class FastDFSConfiguration {
    
    @Bean
    public StorageFactory storageFactory() {
        return new StorageFactory();
    }
}
