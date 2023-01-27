package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        System.out.print("檢測的字串(end結束): ");
        String str=null;

        while (!"end".equals(str=scanner.nextLine())) {
            System.out.print("檢測的單一字元: ");
            String word = scanner.nextLine();
            String[] words = str.split("") ;
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (Arrays.asList(words[i]).contains(word)) {
                    count++;
                }
            }
            System.out.println("字元"+word+"出現次數為"+count);
            
            System.out.print("檢測的字串(end結束): ");
        }
        System.out.print("檢測結束");
    }
}
