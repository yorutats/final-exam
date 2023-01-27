package test70;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class test37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        int n = scanner.nextInt() ;
        HashMap<String, Integer> k = new HashMap<String, Integer>();
        for (int i = 1; i < n+1; i++) {
            int km = scanner.nextInt();
            if (km%9==0||km%11==0) {
                k.put(Integer.toString(i),km);
            }
        }
        
        for (String i : k.keySet()) {
            System.out.println("第"+i+"個點 "+k.get(i));
        }
        
    }
}
