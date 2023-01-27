package test70;

import java.util.Arrays;
import java.util.Scanner;

public class test28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String computerGuess="";
		for(int i=0;i<4;i++) computerGuess+=(int)(Math.random()*10); //電腦自行產生4位數的亂數
		
		//System.out.println("random: "+computerGuess);
		while(true){
			int A=0,B=0;
			boolean check[]=new boolean[4]; //紀錄每個位數是否檢查過
			Arrays.fill(check, false);
			String guess=sc.next(); //使用者輸入數字

			//檢查有幾A
			for(int i=0;i<4;i++){
				if(computerGuess.charAt(i)==guess.charAt(i)){
					A++;
					check[i]=true;
				}
			}
			//檢查有幾B
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(!check[j] && computerGuess.charAt(j)==guess.charAt(i)){
						B++;
						check[j]=true;
						break;
					}
				}
			}
			
			//Output
			if(A==4){
				System.out.println("Correct");
				break;
			}
			else{
				System.out.println(A+"A"+B+"B");
			}
		}
    }
}
