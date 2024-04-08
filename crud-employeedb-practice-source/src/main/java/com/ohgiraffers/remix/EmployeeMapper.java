package com.ohgiraffers.remix;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeById(int id);

    int insertEmployee(EmployeeDTO employee);

    int updateEmployee(EmployeeDTO employee);

    int deleteEmployee(int id);
}
