package day08;

import java.util.ArrayList;

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
        Account account = null;
        for(Account act : accounts) {
            // 帳戶名比對
            if(act.name.equals(name)) {
                account = act;
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
        accounts.remove(name);
    }
}
