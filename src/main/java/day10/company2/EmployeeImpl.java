package day10.company2;

public abstract class EmployeeImpl implements Employee {
    private int salary;
    public EmployeeImpl(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
