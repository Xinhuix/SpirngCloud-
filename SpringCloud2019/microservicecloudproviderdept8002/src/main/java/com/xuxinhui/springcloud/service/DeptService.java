package com.xuxinhui.springcloud.service;

import com.xuxinhui.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}
