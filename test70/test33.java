package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        System.out.print("sA:");
        String sA = scanner.next() ;
        System.out.print("sB:");
        String sb = scanner.next() ;
        String[] sB = scanner.nextLine().split(" ") ;
        
        boolean status = Arrays.toString(sB).contains(sA);
 
        if(status){
            System.out.println("子字串判斷為:YES");
 
        }else{
            System.out.println("子字串判斷為:NO");
        }
    }
}
