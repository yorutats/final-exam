package test70;

import java.util.ArrayList;
import java.util.Scanner;

public class test46 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("輸入筆數n:");
        int n = scanner.nextInt();
        
        String[] medal = { "金", "銀", "銅", "優" };
        ArrayList num = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.print(medal[i]);
            int number = scanner.nextInt();
            num.add(number);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(medal[i]+"牌得到"+num.get(i)+"面");
        }

    }
}
