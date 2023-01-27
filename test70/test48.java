package test70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入英文句子:");
        String[] s = scanner.nextLine().split(" ");
        ArrayList sentence = new ArrayList();
        for (int i = 0; i < s.length; i++) {
            sentence.add(s[i]);
        }
        Collections.reverse(sentence);
        System.out.print(sentence);
    }
}
