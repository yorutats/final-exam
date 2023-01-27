package test70;

import java.util.Scanner;

public class test59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        int money, sum, a, b, c, d, e;
        money = scanner.nextInt();
        a = money / 100;
        b = (money - a * 100) / 50;
        c = (money - a * 100 - b * 50) / 10;
        d = (money - a * 100 - b * 50 - c * 10) / 5;
        e = (money - a * 100 - b * 50 - c * 10 - d * 5);
        sum = a + b + c + d + e;
        
        System.out.println(sum);
    }
}
