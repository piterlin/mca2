package org.ms.mca2.inocos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class INacosApplication {
public static void main(String[] args){
    SpringApplication.run(INacosApplication.class);
}
}
