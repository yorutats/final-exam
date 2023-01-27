package test70;

import java.util.Scanner;

public class test39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        int n = scanner.nextInt();

        for (int i = 1; i <= n - 2; i += 2) {
            for (int j = 1; j <= n / 2; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
        for (int i = 1; i < n; i += 2) {
            System.out.print(i);

        }
        for (int i = n; i >= 1; i-=2) {
            System.out.print(i);
            
        }
        
        System.out.println();
        for (int i = n-2; i >= 1 ; i -= 2) {
            for (int j = 1; j <= n / 2; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
