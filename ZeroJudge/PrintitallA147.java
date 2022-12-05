package ZeroJudge;

import java.util.Scanner;

public class PrintitallA147 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=10000;
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==0)
				break;
			for(int i=1;i<n;i++) {
				if(i%7!=0&&n<m) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

}
