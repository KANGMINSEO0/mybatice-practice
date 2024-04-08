package com.ohgiraffers.remix;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;

public class EmployeeController {
    private final PrintResult printResult;
    private final EmployeeService employeeService;
    public EmployeeController() {
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }
    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null) {
            printResult.printEmployeeList(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectEmployeeById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO employee = employeeService.selectEmployeeById(id);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmployee(Map<String, String> parameter) {

        String name = parameter.get("name");
        String no = parameter.get("no");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        String hireDate = parameter.get("hireDate");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setName(name);
        employee.setNo(no);
        employee.setJobCode(jobCode);
        employee.setSalLevel(salLevel);
        employee.setHireDate(hireDate);

        if (employeeService.registEmployee(employee)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyEmployee(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(id);
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setJobCode(jobCode);
        employee.setSalLevel(salLevel);

        if (employeeService.modifyEmployee(employee)) {
            printResult.printEmployee(employee);
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteEmployee(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO employee = employeeService.selectEmployeeById(id);

        if (employeeService.deleteEmployee(id)) {
            printResult.printEmployee(employee);
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
