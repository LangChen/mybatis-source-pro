package com.chlang.service;

import com.chlang.entity.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * TODO
 *
 * @author chenlang
 * @date 2021/3/4 8:29 下午
 **/
@SpringBootTest
public class EmployeesServiceTest {

    @Autowired
    private EmployeesService employeesService;

    @Test
    public void testGetList(){
        employeesService.getList(1,10);
    }

}
