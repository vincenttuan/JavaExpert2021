package day10.company2;

public class Sales extends EmployeeImpl {
    public Sales(int salary) {
        super(salary);
    }
    
    @Override
    public void job() {
        System.out.println("拜訪客戶");
    }
}
