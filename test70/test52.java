package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("輸入n值:");
        String n = scanner.nextLine();
        HashMap<String, String> data = new HashMap<String, String>();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            System.out.print("請輸入姓名:");
            String name = scanner.nextLine();
            System.out.print("請輸入電子郵件:");
            String email = scanner.nextLine();
            
            data.put(name, email);
        }
        
        System.out.print("請輸入要查詢電子郵件的姓名:");
        String search = scanner.next();
        System.out.println(search+"電子郵件帳號為為"+data.get(search));
    }
}
