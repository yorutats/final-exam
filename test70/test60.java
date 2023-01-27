package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入一串小寫英文:");
        String[] word = scanner.next().split("");
        String[] vowel={"a","e","i","o","u"};
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (word[i].equals(vowel[j])) {
                    word[i]=".";
            }   
            }
        }

        System.out.println(String.join("", word));
    }
}
