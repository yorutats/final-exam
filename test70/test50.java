package test70;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test50 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        String s = scanner.nextLine().replaceAll(" |，|。", "");
        String words="";
        Set<String> str = new LinkedHashSet <>();
        Map<Character,Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))!=null) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
                words+=s.charAt(i);
            } else {
                map.put(s.charAt(i),1);
            }
        }
        String[] word = words.split("");
        for (int i = 0; i < word.length; i++) {
            str.add(word[i]);
        }
        System.out.println(str);
    }
}
