package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;

import java.util.List;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-03-12 15:53
 */
public interface EmployeeMapper {
    /**
     *
     * @return
     */
    List<Employee> getAllEmployee();
}
