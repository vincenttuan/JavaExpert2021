package day10.company2;

public class Operator extends EmployeeImpl {
    public Operator(int salary) {
        super(salary);
    }
    
    @Override
    public void job() {
        System.out.println("操作設備");
    }
}
