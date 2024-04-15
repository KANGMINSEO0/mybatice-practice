package com.ohgiraffers.dynamicsql;

import com.ohgiraffers.common.EmployeeDTO;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {
    List<EmployeeDTO> selectEmployeeByPrice(Map<String, Integer> map);
}
