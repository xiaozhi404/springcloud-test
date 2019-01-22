package cn.gzhu.test.service;

import cn.gzhu.test.entity.Dept;

import java.util.List;

public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
