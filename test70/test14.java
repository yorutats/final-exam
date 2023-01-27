package test70;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        System.out.print("輸入一字串為: ");
        String str=scanner.nextLine();
        System.out.println("There are "+str.length()+" characters");
    }
}
