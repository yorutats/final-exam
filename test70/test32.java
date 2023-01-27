package test70;

import java.util.Scanner;

public class test32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner                    
        System.out.print("請輸入一個正整數:");
        int number = scanner.nextInt();
        if ((number%2==0)&&(number%11==0)&&(number/2!=0)&&(number/7!=0)) {                            
            System.out.print("Yes");
        } else {                           
            System.out.print("No");          
        }
    }
}
