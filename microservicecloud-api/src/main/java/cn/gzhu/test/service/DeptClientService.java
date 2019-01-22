package cn.gzhu.test.service;

import cn.gzhu.test.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping(value = "/depts/{id}")
    public Dept get(@PathVariable("id") long id);

    @GetMapping("/depts")
    public List<Dept> list();

    @PostMapping("/depts")
    public boolean add(Dept dept);
}
