/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author s2000
 */
public class test1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        System.out.println("輸入一個正整數: ");
        int number = scanner.nextInt();
        String s = Integer.toString(number);
        ArrayList<Integer> prime = new ArrayList<Integer>();
        ArrayList<Integer> splitnum = new ArrayList<Integer>();

        //質數新增
        for (int i = 2; i <= number; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
                prime.add(i);
			}
            
            
        }

        //分割字串
        for (int i = 0; i <= s.length(); i++) {
            for (int k = 0; k < i; k++) {
                splitnum.add(Integer.parseInt((s.substring(k,i))));
            }
            
        }

        //找相同元素
        prime.retainAll(splitnum);
        boolean empty = prime.isEmpty();
        if(empty){
            System.out.println("No prime found");
          }else{
            System.out.println("最大質數為:"+Collections.max(prime));
          }

    }

}
