package cn.gzhu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient //开启发现服务功能
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@SpringBootApplication
public class DeptProvider8001_Hystrix_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}
