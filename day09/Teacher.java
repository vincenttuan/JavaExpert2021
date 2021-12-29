package day09;

public class Teacher extends Person {
    private Integer salary;
    
    // 建構子封裝
    public Teacher() {
    }

    public Teacher(Integer salary, String name, Integer age) {
        super(name, age);
        this.salary = salary;
    }
    
    // 方法封裝 getter/setter
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + '}';
    }
    
}
