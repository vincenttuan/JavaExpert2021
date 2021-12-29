package day09;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setNumber(97001);
        s1.setName("John");
        s1.setAge(18);
        
        Student s2 = new Student(97002, "Mary", 19);
        
        // ------------------------------------------
        
        Teacher t1 = new Teacher();
        t1.setSalary(70000);
        t1.setName("Helen");
        t1.setAge(30);
        
        Teacher t2 = new Teacher(65000, "Bob", 29);
        
        // ------------------------------------------
        
        System.out.printf("Student 學號: %d 姓名: %s 年齡: %s\n", s1.getNumber(), s1.getName(), s1.getAge());
        System.out.printf("Student 學號: %d 姓名: %s 年齡: %s\n", s2.getNumber(), s2.getName(), s2.getAge());
        
        System.out.printf("Teacher 薪資: %d 姓名: %s 年齡: %s\n", t1.getSalary(), t1.getName(), t1.getAge());
        System.out.printf("Teacher 薪資: %d 姓名: %s 年齡: %s\n", t2.getSalary(), t2.getName(), t2.getAge());
    }
}
