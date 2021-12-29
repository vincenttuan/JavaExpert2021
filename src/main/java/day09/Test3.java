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
        
        // 算出 Person 平均年齡
        double avgOfAge = 0;
        int sumOfAge = 0;
        for(Person person : persons) {
            sumOfAge += person.getAge();
        }
        avgOfAge = (double)sumOfAge / persons.size();
        System.out.printf("Person 平均年齡: %.1f\n", avgOfAge);
        
        // 算出 Student 平均年齡
        sumOfAge = 0; // 歸零
        avgOfAge = 0; // 歸零
        int countOfStudent = 0; // 學生的數量
        for(Person person : persons) {
            //System.out.println(person.getClass().getSimpleName());
            // 判斷 person 物件是否是學生 Student ?
            if(person.getClass().getSimpleName().equals("Student")) {
                sumOfAge += person.getAge();
                countOfStudent++;
            }
        }
        avgOfAge = (double)sumOfAge/countOfStudent;
        System.out.printf("學生的個數: %d\n", countOfStudent);
        System.out.printf("學生總年齡: %d\n", sumOfAge);
        System.out.printf("學生平均年齡: %.1f\n", avgOfAge);
        
        
    }
}
