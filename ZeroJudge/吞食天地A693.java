package ZeroJudge;

import java.util.Scanner;

public class §]­¹¤Ñ¦aA693 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		final int MAX_N=10000+1;
		int[] food=new int[MAX_N];

		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			for(int i=1;i<=n;i++){	
				food[i]=food[i-1]+sc.nextInt();
			}
			while(m>0){
				int l=sc.nextInt();
				int r=sc.nextInt();
				System.out.println(food[r]-food[l-1]);
				m--;
			}
		}
	}
}
