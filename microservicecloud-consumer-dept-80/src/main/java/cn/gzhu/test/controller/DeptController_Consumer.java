package cn.gzhu.test.controller;

import cn.gzhu.test.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer
{
    //直接定义要消费的服务名
    private static final String REST_URL_PREFIX = "http://microservicecloud-dept";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value="/depts")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/depts", dept, Boolean.class);
    }

    @GetMapping(value="/depts/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/depts/"+id, Dept.class);
    }

    @GetMapping(value="/depts")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/depts", List.class);
    }
}
