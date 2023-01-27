package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test45 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("輸入筆數n:");
        int n = scanner.nextInt();
        String[] medal = { "金", "銀", "銅", "優" };
        HashMap<String, Integer> num = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print(medal[i]);
            int number = scanner.nextInt();
            num.put(medal[i], number);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(medal[i]+"牌得到"+num.get(medal[i])+"面");
        }

    }

}
