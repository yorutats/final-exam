package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入水果:");
        String search = scanner.nextLine();
        String[] fruit={"蘋果","香蕉","葡萄","藍莓","橘子"};
        String[] color={"紅色","黃色","紫色","藍色","橘色"};

        HashMap<String, String> data = new HashMap<String, String>();
        for (int i = 0; i < color.length; i++) {
            data.put(fruit[i], color[i]); 
        }

        System.out.println(search+"是"+data.get(search));
        
    }
}
