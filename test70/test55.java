package test70;

import java.util.Scanner;

public class test55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入一個正整數(<10):");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j+" ");
            }
            for (int k = 0; k < 1; k++) {
                System.out.println();
            }
        }
    }
}
