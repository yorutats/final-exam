package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        System.out.print("輸入查詢組數為N:");
        String s = scanner.nextLine();
        int N =Integer.parseInt(s);

        HashMap<String, Integer> pas = new HashMap<String, Integer>();
        pas.put("123 456", 9000);
        pas.put("456 789", 5000);
        pas.put("789 888", 6000);
        pas.put("336 558", 10000);
        pas.put("775 666", 12000);
        pas.put("566 221", 7000);

        String[] set=new String[N];
        for (int i = 0; i < N; i++) {
            String nb = scanner.nextLine() ;
            set[i]=nb;
            
            
        }
        
        for (int i = 0; i < N; i++) {
            boolean result=pas.containsKey(set[i]);
            if (result) {
                System.out.println(pas.get(set[i]));
            }else{
                System.out.println("error");
            }
        }
        
            
    }
}
