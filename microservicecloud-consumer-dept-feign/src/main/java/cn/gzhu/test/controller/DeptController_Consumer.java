package cn.gzhu.test.controller;

import cn.gzhu.test.entity.Dept;
import cn.gzhu.test.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer
{

    @Autowired
    private DeptClientService deptClientService;

    @PostMapping(value="/depts")
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @GetMapping(value="/depts/{id}")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptClientService.get(id);
        return dept;
    }

    @GetMapping(value="/depts")
    public List<Dept> list() {
        List<Dept> depts = deptClientService.list();
        return depts;
    }
}
