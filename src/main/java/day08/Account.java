package day08;

/*
    帳戶物件
    ---------------------------
    戶名: name
    餘額: balance
    ---------------------------
    存款: deposit(int amount)
    提款: withdraw(int amount)
    明細: print()
*/
public class Account {
    String name;
    int balance;
    void deposit(int amount) {
        if(amount >= 0) {
            balance += amount; //balance = balance + amount;
        }
    }
    void withdraw(int amount) {
        if(amount >= 0) {
            balance -= amount; //balance = balance - amount;
        }
    }
    void print() {
        System.out.printf("%s 帳戶餘額: $%d\n", name, balance);
    }
}
