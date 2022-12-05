package CPE1和2星題目;

import java.util.Scanner;

public class _30Hartals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int N=sc.nextInt();
			int[] arr_N=new int[N];
			int P=sc.nextInt();
			int[] arr_P=new int[P];
			for(int j=0;j<arr_P.length;j++) {
				arr_P[j]=sc.nextInt();
			}
			for(int j=0;j<P;j++) {
				int x=arr_P[j];
				for(int k=x;k<=N;k+=x) {
					arr_N[k-1]++;
				}
			}
			for(int j=1;j<=N;j++) {
				if(j%7==6||j%7==0) {
					arr_N[j-1]=0;
				}
			}
			int loses=0;
			for(int j=0;j<arr_N.length;j++) {
				if(arr_N[j]!=0) {
					loses++;
				}
			}
			System.out.println(loses);
		}

	}

}
