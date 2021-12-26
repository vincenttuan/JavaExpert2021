package day07;

import java.util.*;
import java.io.*;

public class ex73b {

    public static void main(String[] args) throws IOException {
        // 設計一個棒球計分 => 得分數 [三壘, 二壘, 一壘] 出局人數
        /*
            1 => 一壘安打，壘包各往前一個
            2 => 二壘安打，壘包各往前二個
            3 => 三壘安打，壘包各往前三個
            h => 全壘打，壘包清空，回來得分
            4 => 四壞球保送，壘包各往前一個
            o => 三振，出局人數+1
            k => 刺殺，壘包沒有變動，出局人數+1
            s => 犧牲打，跑者往前推動一個        
         */        
        
        ArrayDeque a = new ArrayDeque();
        int i = 0;
        char b;
        int d = 0;
        //初始化壘包
        a.add(0);
        a.add(0);
        a.add(0);
        do {
            //char c;
            //System.out.print("Please Press any char: ");
            //b=System.in.read();
            String str;
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buf = new BufferedReader(in);
            System.out.print("Input a char:");
            str = buf.readLine();
            b = str.charAt(0);
            switch (b) {
                case '1':
                case '4'://四壞
                    a.add(1);
                    d = d + (int) a.removeFirst();
                    break;
                case '2':
                    a.add(1);
                    d = d + (int) a.removeFirst();
                    a.add(0);
                    d = d + (int) a.removeFirst();
                    break;
                case '3':
                    a.add(1);
                    d = d + (int) a.removeFirst();
                    a.add(0);
                    d = d + (int) a.removeFirst();
                    a.add(0);
                    d = d + (int) a.removeFirst();
                    break;
                case 'h':
                    a.add(1);
                    d = d + (int) a.removeFirst();
                    a.add(0);
                    d = d + (int) a.removeFirst();
                    a.add(0);
                    d = d + (int) a.removeFirst();
                    a.add(0);
                    d = d + (int) a.removeFirst();
                    break;
                case 'o'://出局
                case 'k':
                    i++;
                    break;
                case 's'://犧牲打
                    a.add(0);
                    d = d + (int) a.removeFirst();
                    i++;
                    break;
            }
            System.out.print(d);
            System.out.print(a);
            System.out.println(i);
        } while (i <= 2);
    }

}
