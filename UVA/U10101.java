package UVA;

import java.util.Scanner;

public class U10101 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(sc.hasNext()) {
			long num=sc.nextLong();
			System.out.printf("%4d.",count);
			if(num==0) {
				System.out.print(" 0");
			}else {
				bangle(num);
			}
			count++;
			System.out.println();
		}
	}//40000000
	public static void bangle(long num){
		//'kuti' (10000000), 'lakh' (100000), 'hajar' (1000), 'shata' (100)
		if(num>=10000000) {
			bangle(num/10000000);
			System.out.print(" kuti");
			bangle(num%10000000);
		}else if(num>=100000) {
			System.out.print(" "+num/100000+" lakh");
			bangle(num%100000);
		}else if(num>=1000) {
			System.out.print(" "+num/1000+" hajar");
			bangle(num%1000);
		}else if(num>=100) {
			System.out.print(" "+num/100+" shata");
			bangle(num%100);
		}else if(num%100!=0){
			System.out.print(" "+num);
		}
	}

}
