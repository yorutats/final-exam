package test70;

import java.util.Scanner;

public class test67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        String[] n = scanner.nextLine().split(",");
        int cf =1;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (Integer.parseInt(n[i])%Integer.parseInt(n[j])==0 && Integer.parseInt(n[i])!=Integer.parseInt(n[j]) ) {
                    cf=Integer.parseInt(n[j]);
                }
            }
        }

        System.out.println(cf);
    }
}
