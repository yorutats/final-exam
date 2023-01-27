package test70;

import java.util.Scanner;

public class test38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        int n = scanner.nextInt();
        int n1, n2;
        if (n % 2 != 0) {
            n1 = n / 2 + 1;
        } else {
            n1 = n / 2;
        }
        n2 = n - n1;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
