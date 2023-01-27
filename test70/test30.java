package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        System.out.print("小明身上有幾元:");
        int money = scanner.nextInt();
        System.out.print("販賣機有幾種飲料:");
        int type = scanner.nextInt();
        int[] drinks=new int[type];
        int canbuy=0;
        for (int i = 0; i < type; i++) {
            int drink=scanner.nextInt();
            drinks[i] = drink;
            if (drinks[i]<=money) {
                canbuy++;
            }
        }
        System.out.println(canbuy);
    }   
}
