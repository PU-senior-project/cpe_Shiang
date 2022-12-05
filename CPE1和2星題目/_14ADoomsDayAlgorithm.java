package CPE1和2星題目;

import java.util.Scanner;

public class _14ADoomsDayAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] months= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int N=sc.nextInt();
		//  1/1 Saturday
		for(int i=0;i<N;i++) {
			int M=sc.nextInt();
			int D=sc.nextInt();
			int days=0;
			for(int j=0;j<M;j++) {
				days+=months[j];
			}
			days+=D+4;
			System.out.println(week[days%7]);
		}

	}

}
