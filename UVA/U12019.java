package UVA;

import java.util.Scanner;

public class U12019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] months= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int N=sc.nextInt();
		//  1/1 Saturday
		for(int i=0;i<N;i++) {
			int M=sc.nextInt();
			int D=sc.nextInt();
			int days=0;
			for(int j=1;j<M;j++) {
				days+=months[j-1];
			}
			days+=D+4;
			System.out.println(week[days%7]);
		}

	}

}
