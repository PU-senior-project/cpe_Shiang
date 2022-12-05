package ZeroJudge;

import java.util.Scanner;

public class GranTurismo5D985 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			System.out.printf("Track %d: \n",i+1);
			int M=sc.nextInt();
			int[] min=new int[M];
			int[] second=new int[M];
			int sec=0;
			for(int j=0;j<M;j++) {
				min[j]=sc.nextInt();
				second[j]=sc.nextInt();
			}
			int min_sec=60*min[0]+second[0];
			for(int j=0;j<M;j++) {
				min_sec=Math.min(min_sec,60*min[j]+second[j]);
			}
			System.out.printf("Best Lap: %d minute(s) %d second(s).\n",min_sec/60,min_sec%60);
			for(int k=0;k<M;k++) {
				sec+=60*min[k]+second[k];
			}
			sec/=M;
			System.out.printf("Average: %d minute(s) %d second(s).\n\n",sec/60,sec%60);	
		}

	}

}
