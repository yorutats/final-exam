package test70;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        int M,i,N;
        System.out.print("請輸入階層值M：");
        M = scanner.nextInt();
        i=0;
        N=1;
        while (M>N) {
            i++;
            N*=i;
            //N*=++i; //先執行再加一
        }
        System.out.printf("超過M為%d的最小階層N為%d", M, i);
    }
}
