package day08;

public class BankTest {
    public static void main(String[] args) {
        // 建立銀行
        Bank bank = new Bank();
        // 建立帳戶
        bank.addAccount("John", 10000);
        bank.addAccount("Mary", 8000);
        bank.addAccount("Bobo", 5000);
        // 印出全部帳戶資料
        bank.print();
        
    }
}
