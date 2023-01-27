package test70;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        System.out.print("輸入s1為:");
        String s1 = scanner.next() ;
        System.out.print("輸入s2為:");
        String s2 = scanner.next() ;
        
        boolean status = s2.contains(s1);
 
        if(status){
            System.out.println("YES");
 
        }else{
            System.out.println("NO");
        }
        
    }
}
