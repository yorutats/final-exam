package test70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//題目似乎寫錯答案，A K 5 9 10=38

public class test17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        String cards = scanner.nextLine();
        String[] sn = cards.split(" ") ;
        String[] st1=cards.replaceAll("[^A-Za-z]", "").split("");//分開英文字母

        HashMap<String, Integer> ajqk = new HashMap<String, Integer>();
        ajqk.put("A", 1);
        ajqk.put("J", 11);
        ajqk.put("Q", 12);
        ajqk.put("K", 13);
        
        int sum =0;
        List<String> number = new ArrayList<>(Arrays.asList(sn));
        for (int i = 0; i < st1.length; i++) {
            number.remove(st1[i]);
            sum+=ajqk.get(st1[i]);
        }
        
        for (int i = 0; i < number.size(); i++) {
            sum+=Integer.parseInt(number.get(i));
        }

        // System.out.println(Arrays.toString(st2));
        System.out.println(sum);
    }
}
