package com.chlang.mapper;

import com.chlang.entity.Employees;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@org.apache.ibatis.annotations.Mapper
public interface EmployeesMapper extends Mapper<Employees>, IdsMapper<Employees>, MySqlMapper<Employees> {
}