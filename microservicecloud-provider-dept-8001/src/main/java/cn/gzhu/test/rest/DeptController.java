package cn.gzhu.test.rest;

import cn.gzhu.test.entity.Dept;
import cn.gzhu.test.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService service;

    @PostMapping
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping("/{1}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<Dept> list()
    {
        return service.list();
    }

}

