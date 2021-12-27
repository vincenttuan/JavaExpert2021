package day08;

/*
    帳戶物件
    ---------------------------
    戶名: name
    餘額: balance
    ---------------------------
    存款: deposit(int amount)
    提款: withdraw(int amount)
    轉帳: transfer(int amount, Account act)
    明細: print()
*/
public class Account {
    String name;
    private int balance; // 不允許直接修改屬性
    
    // 建構子 1
    public Account() {
        System.out.println("建構子 1");
    }
    
    // 建構子 2
    public Account(String name, int balance) {
        System.out.println("建構子 2");
        this.name = name;
        //this.balance = balance;
        deposit(balance);
    }
    
    // 建構子 3
    public Account(String name) {
        System.out.println("建構子 3");
        this.name = name;
    }
    
    // 存款方法
    void deposit(int amount) {
        if(amount >= 0) {
            balance += amount; //balance = balance + amount;
        }
    }
    
    // 提款方法
    void withdraw(int amount) {
        if(amount >= 0) {
            balance -= amount; //balance = balance - amount;
        }
    }
    
    // 轉帳方法
    void transfer(int amount, Account act) {
        // 驗證是否有足夠的金額可以轉
        if(amount <= balance) {
            // 轉出方: 提款
            withdraw(amount);
            // 轉入方(act): 存款
            act.deposit(amount);
        }
    }
    
    // 列印資料
    void print() {
        System.out.printf("%s 帳戶餘額: $%,d\n", 
                          name, balance);
    }
}
