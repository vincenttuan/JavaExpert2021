package day08;

import java.util.ArrayList;
/*
    銀行物件
    ---------------------------
    所有帳戶: accounts
    ---------------------------
    開戶: addAccount(String name, int balance)
    取得帳戶: getAccount(String name)
    移除帳戶: removeAccount(String name)
*/
public class Bank {
    // 所有帳戶
    private ArrayList<Account> accounts = new ArrayList<>();
    
    // 開戶
    void addAccount(String name, int balance) {
        Account account = new Account(name, balance);
        accounts.add(account);
    }
    
    // 取得帳戶
    Account getAccount(String name) {
        Account account = null; // 先假設還沒有資料
        for(Account act : accounts) {
            // 帳戶名比對
            if(act.name.equals(name)) {
                account = act; // 得到資料
                break;
            }
        }
        return account;
    }
    
    // 移除帳戶
    void removeAccount(String name) {
        // 1. 先取得帳戶
        Account account = getAccount(name);
        // 2. 再移除帳戶
        accounts.remove(account);
    }
    
    // 印出銀行全部帳戶資料
    void print() {
        for(Account act : accounts) {
            act.print();
        }
    }
}
