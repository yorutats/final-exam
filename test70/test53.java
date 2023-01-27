package test70;

import java.util.Scanner;

public class test53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入路程公里數(km):");
        Double km = scanner.nextDouble()*1000;
        int cost = 0;
        if (km<1500) {
            cost=75;
        } else {
            cost+=(Math.ceil((km-1500)/250)*5)+75;
        } 

        System.out.println("所需的車資為:"+cost);
    }
}
