package ZeroJudge;

import java.util.Scanner;

public class ¤û¥J«Ü¦£B578 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(y<30) {
			int a=x+2;
			int b=y+30;
			if(a>24) {
				a-=24;
			}else if(a==24) {
				a-=24;
			}
			System.out.printf("%02d:%02d",a,b);
		}else if(y>=30) {
			int a=x+3;
			int b=(y+30-60);
			if(a>24) {
				a-=24;
			}else if(a==24) {
				a-=24;
			}
			System.out.printf("%02d:%02d",a,b);
		}

	}

}
