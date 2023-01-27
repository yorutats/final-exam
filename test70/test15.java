package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        System.out.print("輸入一組四位數字為: ");
        String pws = scanner.nextLine();
        int[] pw = new int[4];
        int[] encrypt  = new int[4];
        for (int i = 0; i < 4; i++) {
            pw[i]=Integer.parseInt(pws.split("")[i]);
            encrypt[i]=(int) ((int) (pw[i]+7)%10);
        }

        int t = encrypt[2];
        int t2 = encrypt[3];
        encrypt[2]=encrypt[0];
        encrypt[0]=t;
        encrypt[3]=encrypt[1];
        encrypt[1]=t2;



        System.out.println(Arrays.toString(pw));
        System.out.println(Arrays.toString(encrypt));
    }
}
