package test70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class test8 {
    
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
            
        int a,counter;
        System.out.print("輸入第一行正整數為:");
        a = scanner.nextInt();
        System.out.print("第二行中數列中的數字為(逗號分開):");
        String b = scanner.next() ;
        String[] sn = b.split(",") ;
        Arrays.sort(sn);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < sn.length; i++) {
                numbers.add(Integer.parseInt((sn[i])));
        }


        Map map = new HashMap();
        for (int i = 0; i <= a; i++) {
            if (map.containsKey(i)==false) {
                map.put(i, 0);
            }
        }
 
        for (Integer temp : numbers) {
            Integer count = (Integer) map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }

        
        Collection<Integer> val =map.values();
        Object[] obj=val.toArray();


        Integer[] integerArray = new Integer[obj.length];
        HashSet sites = new HashSet ();
        // 將元素從對像數組複製到整數數組
        for (int i = 0; i < obj.length; i++) {
            integerArray[i] = (Integer)obj[i];
            sites.add(integerArray[i]);
        }

        int num = 0;
        for (int i = 0; i <= a; i++) {
            if (integerArray[i]>num) {
                num=i;
            }
        }
        if (sites.size()==2) {
            System.out.println("每個數字剛好只出現一次");
        }else{
            System.out.printf("最大出現次數的數字為: %d\n", num);
            System.out.printf("出現次數為: %d\n", integerArray[num]);
        }
        
        System.out.println(Arrays.toString(integerArray));
        
    }

    

    
}
