package day10.company;

public class Sales implements Employee {
    private int salary;
    
    public Sales(int salary) {
        this.salary = salary;
    }
    
    @Override
    public void job() {
        System.out.println("拜訪客戶");
    }

    @Override
    public int getSalary() {
        return salary;
    }
    
}
