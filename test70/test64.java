package test70;

import java.util.Scanner;

public class test64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        int n1,n2,t;
        System.out.print("請輸入第一個要判斷的數字:");
        n1 = scanner.nextInt();
        System.out.print("請輸入第二個要判斷的數字:");
        n2 = scanner.nextInt();
        t=0;
        for (int i = 2; i < n1; i++) {
            if (n1%i==0) {
                t++;
            }
        }

        for (int i = 2; i < n2; i++) {
            if (n2%i==0) {
                t++;
            }
        }
        if (n2-n1==2 && t==0 ) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        
    }
}
