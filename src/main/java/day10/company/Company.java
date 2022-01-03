package day10.company;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();
    
    // 新增員工
    public void add(Employee employee) {
        employees.add(employee);
    }
    
    // 印出每位員工的薪資與工作內容
    public void print() {
        for(Employee employee : employees) {
            System.out.printf("薪資：%,d 工作內容：", employee.getSalary());
            employee.job();
        }
    }
    
    // 取得所有員工的資料
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
