package test70;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        String[] suject={"國文","英文","微積分","體育","程式設計"};
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        int[] score=new int[suject.length];
        float sum=0;
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        for (int i = 0; i < suject.length; i++) {                       
            System.out.print(suject[i]+":");
            int sc = scanner.nextInt();
            Sites.put(sc, suject[i]);
            score[i]=sc;
            sum+=sc;
        }

        Arrays.sort(score);
        System.out.println(sum/suject.length);
        System.out.println("最高科目:"+Sites.get(score[4])+score[4]+"分");
        System.out.println("最低科目:"+Sites.get(score[0])+score[0]+"分");

        
    }
}
