package test70;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class test66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入string_a:");
        String[] a = scanner.nextLine().split("");
        System.out.print("請輸入string_b:");
        String[] b = scanner.nextLine().split("");
        Set<String> words = new LinkedHashSet <>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    words.add(a[i]);
                }
            }
        }
        System.out.println(String.join("", words));
        
        
    }
}
