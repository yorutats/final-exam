package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        
        int freq,ppl;
        System.out.print("請輸入考試次數及學生數:");
        String s = scanner.nextLine() ;
        String[] nums = s.split(" ") ;
        freq = Integer.parseInt(nums[0]) ;
        ppl = Integer.parseInt(nums[1]) ;

        System.out.print("每次考試所占的比率:");
        String r = scanner.nextLine() ;
        String[] ratio = r.split(" ") ;

        float allaver=0;
        float[][] aver = new float[ppl][freq];
        
        String[][] score=new String[ppl][freq];
        for (int i = 0; i < ppl; i++) {
            String sc = scanner.nextLine();
            String[] single = sc.split(" ");
            for (int j = 0; j < freq; j++) {
                score[i][j]  = single[j] ;
                aver[i][j]=(Integer.parseInt(score[i][j])*+Float.parseFloat(ratio[j]));
                
            }
        }

        for (int i = 0; i < ppl; i++) {
            for (int j = 0; j < freq; j++) {
                allaver+=aver[i][j];
            }
        }
        System.out.println(Math.round((allaver/ppl)* 100.0) / 100.0);
    }
}
