package day10.company2;

public class Programmer extends EmployeeImpl {

    public Programmer(int salary) {
        super(salary);
    }
    
    @Override
    public void job() {
        System.out.println("撰寫程式");
    }
    
}
