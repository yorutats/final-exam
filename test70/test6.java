package test70;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        
        String s,max,min;
        System.out.print("輸入值為:");
        s = scanner.next() ;
        String[] sn = s.split(",") ;
        Arrays.sort(sn,Collections.reverseOrder());  //大小排序
        max = String.join("", sn); //合併為一整數
        Arrays.sort(sn);
        min = String.join("", sn);

        System.out.println(Integer.parseInt(max)-Integer.parseInt(min));  

        
    }
    
}
