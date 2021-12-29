package day09;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student(97001, "John", 18);
        Student s2 = new Student(97002, "Mary", 19);
        Student s3 = new Student(97003, "Jane", 18);
        Teacher t1 = new Teacher(70000, "Helen", 30);
        
        Person[] persons = {s1, s2, s3, t1};
        System.out.printf("人數: %d\n", persons.length);
        // 列出所有人的姓名與年齡
        for(Person person : persons) {
            System.out.printf("姓名: %s 年齡: %d\n", person.getName(), person.getAge());
        }
        
    }
}
