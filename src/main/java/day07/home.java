package day07;

import java.util.Scanner;

public class home {

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        String a;
        System.out.print("輸入任意字串 =>");
        a = keyBoard.nextLine();
        StringBuilder sb1 = new StringBuilder();
        char c;
        for (int i = 0; i <= a.length() - 1; i++) {
            c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                sb1.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb1.append(Character.toUpperCase(c));
            } else{
                sb1.append(c);
            }
        }
        System.out.println(sb1);
    }

}
