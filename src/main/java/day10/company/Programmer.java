package day10.company;

public class Programmer implements Employee {
    private int salary;
    
    public Programmer(int salary) {
        this.salary = salary;
    }
    
    @Override
    public void job() {
        System.out.println("撰寫程式");
    }

    @Override
    public int getSalary() {
        return salary;
    }
    
}
