package ZeroJudge;

import java.util.Scanner;

public class µ¥®t¼Æ¦CB971 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(a<b) {
				for(int i=a;i<=b;i+=c) {
					System.out.print(i+" ");
				}
			}else if(a>b){
				for(int i=a;i>=b;i+=c) {
					System.out.print(i+" ");
				}
			}else {
				System.out.print(a);
			}
		}
	}

}
