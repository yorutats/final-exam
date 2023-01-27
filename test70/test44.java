package test70;

import java.util.Scanner;

public class test44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        int M, D, S;
        M = scanner.nextInt();
        D = scanner.nextInt();
        S = (M * 2 + D) % 3;
        switch (S) {
            case 0:
                System.out.println("普通");
                break;
            case 1:
                System.out.println("吉");
                break;
            case 2:
                System.out.println("大吉");
                break;

            default:
                break;
        }
    }
}
