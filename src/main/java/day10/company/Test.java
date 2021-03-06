package day10.company;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        // 應試者
        Programmer p1 = new Programmer(50000);
        Programmer p2 = new Programmer(55000);
        Sales s1 = new Sales(35000);
        Sales s2 = new Sales(42000);
        Operator o1 = new Operator(32000);
        Operator o2 = new Operator(29000);
        // 加入員工
        company.add(p1);
        company.add(s2);
        company.add(o1);
        // 列印員工
        company.print();
        // 請求出此間公司「所有員工」的「薪資總合」 = ?
        int sum = 0;
        for(Employee employee : company.getEmployees()) {
            sum += employee.getSalary();
        }
        System.out.printf("薪資總合：%,d\n", sum);
        
    }
}
