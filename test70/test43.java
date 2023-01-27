package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        int T = scanner.nextInt();
        int[] people = new int[T];
        for (int i = 0; i < T; i++) {
            int ppl = scanner.nextInt();
            people[i]=ppl;
        }
        Arrays.sort(people);
        System.out.println(people[T-1]);
    }
}
