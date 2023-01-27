package test70;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        String[] pas = scanner.nextLine().split(" ");
        Map<String, Integer> Morse = new HashMap<>();
        String[] key={"-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
        for (int i = 0; i < key.length; i++) {
            Morse.put(key[i], i);
        }
        for (int i = 0; i < pas.length; i++) {
            System.out.print(Morse.get(pas[i]));
        }
    }
}
