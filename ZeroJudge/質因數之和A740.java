package ZeroJudge;

import java.util.Scanner;

public class 質因數之和A740 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int sum=0;
			//找質數記得用根號下去做不然太慢
			for(int i=2;i<=Math.sqrt(n);i++) {
				while(n%i==0) {
					sum+=i;
					n/=i;
				}
			}
			//System.out.println(sum);
			if(n==1) {
				System.out.println(sum);	
			}else {
				System.out.println(sum+n);  
			}
		}
	}

}
