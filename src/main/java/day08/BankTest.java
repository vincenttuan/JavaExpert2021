package day08;

public class BankTest {
    public static void main(String[] args) {
        // 建立銀行
        Bank bank = new Bank();
        // 建立帳戶
        bank.addAccount("John", 10000);
        bank.addAccount("Mary", 8000);
        bank.addAccount("Bobo", 5000);
        // 印出銀行全部帳戶資料
        bank.print();
        //------------------------------------
        // 將 3000 元存入 Mary 的帳戶
        System.out.println("-------------------------");
        int amount = 3000;
        String name = "Mary";
        // 得到 Mary 的帳戶物件
        Account act = bank.getAccount(name);
        if(act != null) {
            // 存款
            act.deposit(amount);
            System.out.println("存款完畢: 將 3000 元存入 Mary 的帳戶");
        }
        // 印出銀行全部帳戶資料
        bank.print();
        //------------------------------------
        // 將 2500 元從 John 的帳戶中提出
        System.out.println("-------------------------");
        amount = 2500;
        name = "John";
        // 得到 John 的帳戶物件
        act = bank.getAccount(name);
        if(act != null) {
            // 提款
            act.withdraw(amount);
            System.out.println("提款完畢: 將 2500 元從 John 的帳戶中提出");
        }
        // 印出銀行全部帳戶資料
        bank.print();
        //------------------------------------
    }
}
