package CPE1和2星題目;

import java.util.Scanner;

public class _35GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			int G=0;
			if(N==0) break;
			for(int i=1;i<N;i++) {
				for(int j=i+1;j<=N;j++) {
					G+=GCD(i,j);
				}
			}
			System.out.println(G);
		}

	}
	public static int GCD(int a,int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}

}
