package day10.company2;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();
    
    // 新增員工
    public void add(Employee employee) {
        employees.add(employee);
    }
    
    // 刪除員工
    public void delete(int index) {
        employees.remove(index);
    }
    
    // 列印
    public void print() {
        int index = 0;
        for(Employee employee : employees) {
            System.out.printf("index=%d 薪資: $%,d 工作內容: ", index++, employee.getSalary());
            employee.job();
        }
    }
    
    // 取得所有員工資料
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    // 員工薪資總合
    public int getSumOfSalary() {
        int sum = 0;
        for(Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    
    // 員工平均薪資
    public double getAvgOfSalary() {
        int sum = getSumOfSalary();
        int size = employees.size();
        
        return (double)sum / size;
    }
}
