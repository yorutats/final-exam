package test70;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class test51 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        String s1,s2;
        s1 = scanner.nextLine().replaceAll("，|。", "");
        s2 = scanner.nextLine().replaceAll("，|。", "");
        Set<String> same = new LinkedHashSet <>();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i)==s2.charAt(j)) {
                    same.add(String.valueOf(s2.charAt(j)));
                }
            }
            
        }
        System.out.println(same);
    }
}
