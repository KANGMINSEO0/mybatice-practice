package com.ohgiraffers.common;

public class EmployeeDTO {

    private int id;
    private String name;
    private String no;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private String salary;
    private int bonus;
    private int managerId;
    private String hireDate;
//    private java.util.Date hireDate;
    private String entDate;
//    private java.util.Date entDate;
    private String entYn;

    public EmployeeDTO() {}

    public EmployeeDTO(int id, String name, String no, String email, String phone, String deptCode, String jobCode, String salLevel, String salary, int bonus, int managerId, String hireDate, String entDate, String entYn) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.entYn = entYn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getEntDate() {
        return entDate;
    }

    public void setEntDate(String entDate) {
        this.entDate = entDate;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode=" + deptCode +
                ", jobCode=" + jobCode +
                ", salLevel=" + salLevel +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId=" + managerId +
                ", hireDate=" + hireDate +
                ", entDate=" + entDate +
                ", entYn='" + entYn + '\'' +
                '}';
    }
}
