package day09;

public class Student extends Person {
    private Integer number; // 學號
    
    // 建構子封裝
    public Student() {
    }

    public Student(Integer number, String name, Integer age) {
        super(name, age);
        this.number = number;
    }
    
    // 方法封裝 getter/setter
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" + "number=" + number + '}';
    }

    
}
