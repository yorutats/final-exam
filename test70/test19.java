package test70;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        System.out.print("組數為:");
        int sets = scanner.nextInt();

        String[] cost=new String[3];
        for (int i = 0; i < sets; i++) {
            System.out.print("第"+(i+1)+"組:");
            String[] set = scanner.nextLine().split(" ") ;
            cost[i]=String.valueOf(250*Integer.parseInt(set[0])+175*Integer.parseInt(set[1]));
        }
        for (int i = 0; i < sets; i++) {
            System.out.println("第"+(i+1)+"組應收費用:"+cost[i]);
        }
        
    }
}
