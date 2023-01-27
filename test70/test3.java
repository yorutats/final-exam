package test70;

import java.util.Scanner;

public class test3 {

    public static String input(String text){
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        String str = sc.next();
        sc.close();
        return str;
    }

    public static void main(String[] args) {
        String[] zodiac = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};
        int year = Integer.parseInt(input("請輸入西元年"));
        int i = year%12-4;
        System.out.println(zodiac[i]);

    }
}
