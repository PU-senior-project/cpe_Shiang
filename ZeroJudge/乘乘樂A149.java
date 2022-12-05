package ZeroJudge;

import java.util.Scanner;

public class ­¼­¼¼ÖA149 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int m=sc.nextInt();
				int total;
				total=(m==0)?0:1;
				while(m>0) {
					total*=m%10;
					m=m/10;
				}
				System.out.println(total);
			}
		}

	}

}
