package test70;

import java.util.Scanner;

public class test68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入第一組數字:");
        String pas = scanner.nextLine();
        System.out.print("請輸入第二組數字:");
        String n = scanner.nextLine();
        int A,B;
        A=0;
        B=0;
        for (int i = 0; i < pas.length(); i++) {
            if (pas.charAt(i)==n.charAt(i)) {
                A+=1;
            }
            for (int j = 0; j < pas.length(); j++) {
                if (pas.charAt(i)==n.charAt(j)) {
                    B+=1;
            }
            }
            
        }
        
        if (A==4) {
            System.out.println(A+"A"+(B-A)+"B"+" 全對");
        }else{
            System.out.println(A+"A"+(B-A)+"B"+" 加油");
        }
        
        

    }
}
