package ZeroJudge;

import java.util.Scanner;

public class 求數列第n項B558 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int sum=1;
			for(int i=1;i<=n;i++) {
				sum+=i-1;
			}
			System.out.println(sum);
		}
	}

}
