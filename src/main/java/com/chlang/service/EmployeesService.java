package com.chlang.service;

import com.chlang.entity.Employees;
import com.chlang.mapper.EmployeesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author chenlang
 * @date 2021/3/4 8:25 下午
 **/
@Service
public class EmployeesService {

    @Autowired
    private EmployeesMapper employeesMapper;

    public List<Employees> getList(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Employees> employeesList = employeesMapper.selectAll();
        PageInfo<Employees> pageInfo = new PageInfo<>(employeesList);
        employeesList = pageInfo.getList();

        return employeesList;
    }

}
