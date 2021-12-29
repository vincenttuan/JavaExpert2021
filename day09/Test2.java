package day09;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student(97001, "John", 18);
        Student s2 = new Student(97002, "Mary", 19);
        Student s3 = new Student(97003, "Jane", 18);
        Teacher t1 = new Teacher(70000, "Helen", 30);
        
        Person[] persons = {s1, s2, s3, t1}; // 靜態陣列
        System.out.printf("人數: %d\n", persons.length);
        // 列出所有人的姓名與年齡
        for(Person person : persons) {
            System.out.printf("姓名: %s 年齡: %d\n", person.getName(), person.getAge());
        }
        // 計算平均年齡
        int sumOfAge = 0; // 年齡的總和
        for(Person person : persons) {
            sumOfAge += person.getAge(); // 年齡利用 += 進行累加
        }
        System.out.printf("總年齡: %d\n", sumOfAge);
        double avgOfAge = (double)sumOfAge / persons.length;
        System.out.printf("平均年齡: %.1f\n", avgOfAge);
        
    }
}
