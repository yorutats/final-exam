package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請輸入欲租借的書籍:");
        String n = scanner.next();
        String[] a ={"飢餓遊戲3","解憂雜貨店","怪獸與牠們的產地","哈利波特6","我的阿富汗筆友","祈念之樹","樓下的房客","小王子"};
        String[] b ={"房思琪的初戀樂園","等一個人咖啡","鬼滅之刃14","神農賞百草","麥田捕手","老人與海","傲慢與偏見","與神同行"};
        // HashMap<String, String> dataA = new HashMap<String, String>();
        // data.put("飢餓遊戲3", "1");
        // data.put("解憂雜貨店", "1");

        int notfound =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(n)) {
                System.out.println("在新書架A的第"+(i+1)+"本");
            }else{
                notfound++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals(n)) {
                System.out.println("在新書架B的第"+(i+1)+"本");
            }else{
                notfound++;
            }
        }
        if (notfound==(a.length+b.length)) {
            System.out.println("查無此書籍");
        }

    }
}
