package day10.company;

import java.util.ArrayList;

public class Operator implements Employee {
    private int salary;
    
    public Operator(int salary) {
        this.salary = salary;
    }
    
    @Override
    public void job() {
        System.out.println("操作設備");
    }

    @Override
    public int getSalary() {
        return salary;
    }

    
}
