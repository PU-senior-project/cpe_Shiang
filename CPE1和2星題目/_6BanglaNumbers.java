package CPE1和2星題目;

import java.util.*;
public class _6BanglaNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(sc.hasNext()) {
			long num=sc.nextLong();
			System.out.printf("%4d.",count);
			if(num==0) {
				System.out.print(" 0");
			}else {
				bangla(num);
			}
			count++;
			System.out.println();
		}
	}
	public static void bangla(long num){
		//'kuti' (10000000), 'lakh' (100000), 'hajar' (1000), 'shata' (100)
		if(num>=10000000) {
			bangla(num/10000000);
			System.out.print(" kuti");
			bangla(num%10000000);
		}else if(num>=100000) {
			System.out.print(" "+num/100000+" lakh");
			bangla(num%100000);
		}else if(num>=1000) {
			System.out.print(" "+num/1000+" hajar");
			bangla(num%1000);
		}else if(num>=100) {
			System.out.print(" "+num/100+" shata");
			bangla(num%100);
		}else if(num%100!=0){
			System.out.print(" "+num);
		}
	}

}
