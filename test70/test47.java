package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("輸入筆數n:");
        String n = scanner.nextLine();
        HashMap<String, String> word = new HashMap<String, String>();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String w = scanner.nextLine();
            String ch = w.split(" ")[0];
            String en = w.split(" ")[1];
            word.put(ch, en);
        }
        
        System.out.print("輸入欲查詢單字:");
        String search = scanner.next();
        System.out.println(search+"中文意思為"+word.get(search));
    }
}
