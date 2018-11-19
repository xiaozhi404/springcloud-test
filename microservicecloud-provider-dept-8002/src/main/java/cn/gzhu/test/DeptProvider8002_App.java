package cn.gzhu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient //开启发现服务功能
@SpringBootApplication
public class DeptProvider8002_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
