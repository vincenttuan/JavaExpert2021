package day09;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student(96001, "John", 23);
        Student s2 = new Student(97001, "Mary", 18);
        Student s3 = new Student(95001, "Bobo", 20);
        Teacher t1 = new Teacher(70000, "Jean", 31);
        Teacher t2 = new Teacher(85000, "Mico", 48);
        
        // <> 泛型: 限制容器中可以放的資料類型
        ArrayList<Person> persons = new ArrayList<>(); // 動態陣列
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        persons.add(t2);
        System.out.println(persons);
        
    }
}
