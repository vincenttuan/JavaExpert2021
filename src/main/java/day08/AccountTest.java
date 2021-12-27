package day08;

public class AccountTest {
    public static void main(String[] args) {
        Account act = new Account();
        act.name = "John";
        //act.balance = -1_0000; // 不允許直接修改屬性
        act.deposit(10000); // 存款 10000
        act.deposit(5000);  // 存款 5000
        act.print();
        act.withdraw(3000); // 提款 3000
        act.print();
        System.out.println("--------------------");
        //------------------------------------------
        Account act2 = new Account("Mary", 8000);
        act2.print();
        //------------------------------------------
        Account act3 = new Account("Bob");
        act3.print();
        //------------------------------------------
        System.out.println("--------------------");
        System.out.println("Mary 轉帳給 Bob $2000");
        act2.transfer(2000, act3);
        act2.print();
        act3.print();
    }
}
