package com.ohgiraffers.dynamicsql;

import com.ohgiraffers.common.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmployeeService {

    private DynamicSqlMapper mapper;
    public void selectEmployeeByPrice(int price) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        Map<String, Integer> map = new HashMap<>();

        map.put("price", price);

        List<EmployeeDTO> employeeList = mapper.selectEmployeeByPrice(map);

        if (employeeList != null && employeeList.size() > 0) {
            for (EmployeeDTO employee : employeeList) {
                System.out.println(employee);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();
    }
}
