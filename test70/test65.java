package test70;

import java.util.Scanner;

public class test65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入A的好友:");
        String[] A = scanner.nextLine().split(" ");
        System.out.print("請輸入B的好友:");
        String[] B = scanner.nextLine().split(" ");
        int mutfri=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i].equals(B[j])) {
                    mutfri++;
                }
            }
        }
        System.out.println(mutfri);
        
    }
}
