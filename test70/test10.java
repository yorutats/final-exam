package test70;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("輸入N及M為:");
        String nm = scanner.nextLine();
        int N = Integer.parseInt(nm.split(" ")[0]);
        int M = Integer.parseInt(nm.split(" ")[1]);

        int arr[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            System.out.print("輸入矩陣值第" + (i + 1) + "列為:");
            String[] a = scanner.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(a[j]);
            }
        }

        int narr[][] = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                narr[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.print("輸出矩陣數值第" + (i + 1) + "列為:");
            for (int j = 0; j < N; j++) {
                System.out.print(narr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}
