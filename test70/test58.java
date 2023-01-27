package test70;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        int[] num =new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("請輸入第"+(i+1)+"個數字:");
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
         
        System.out.println("最大的3個數字為"+num[num.length-1]+","+num[num.length-2]+","+num[num.length-3]);
        System.out.println("最小的3個數字為"+num[2]+","+num[1]+","+num[0]);
    }
}
