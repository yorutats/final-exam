package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        int times = scanner.nextInt();
        int[][] number = new int[times][4];
        String[][] numberstr = new String[times][4];
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < 4; j++) {
                int num = scanner.nextInt();
                number[i][j] = num;
                numberstr[i][j] = Integer.toString(num);
            }
        }

        int tf,ge;
        int geo=0;
        int tol=0;
        tf=0;
        ge=0;
        int[] tolout = new int[4];
        boolean[] atf = new boolean[3];
        for (int i = 0; i < times; i++) {
            tol = number[i][1] - number[i][0];
            geo = number[i][1] / number[i][0];
            for (int j = 0; j < number[i].length - 1; j++) {
                if (number[i][j + 1] - number[i][j] == tol) {
                    tf++;
                    if (tf == 4){
                        System.out.println("此為等差數列");
                    }
                    
                }
                if (number[i][j + 1] / number[i][j] == geo) {
                    ge++;
                    if (ge == 4){
                        System.out.println("此為等比數列");
                    }
                }
                
            }
        }

    }
}
