package ZeroJudge;

import java.util.Scanner;

public class LetMeCountTheWaysD133 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] coin= {1,5,10,25,50};
			long[] dp=new long[30001];
			dp[0]=1;  //0元設定為可以湊到
			for(int i=0;i<5;i++) {  //依序加入各種面額
				for(int j=coin[i];j<=n;j++) { //低價位逐步到高價位
					dp[j]+=dp[j-coin[i]];
					System.out.println(i+" "+j);
					//dp[1]=dp[1-1]=1
					//dp[2]=dp[2-1]=1
					//dp[3]=dp[3-1]=1
					//dp[4]=dp[4-1]=1
					//dp[5]=dp[5-1]=1   dp[5]=dp[5-5]=1 1+1=2
					//dp[6]=dp[6-1]=1   dp[6]=dp[6-5]=1 1+1=2
					//dp[7]=dp[7-1]=1   dp[7]=dp[7-5]=1 1+1=2
					//dp[8]=dp[8-1]=1   dp[8]=dp[8-5]=1 1+1=2
					//dp[9]=dp[9-1]=1   dp[9]=dp[9-5]=1 1+1=2
					//dp[10]=dp[10-1]=1 dp[10]=dp[10-5]=2   dp[10-10]=1 2+1+1=4
				}
			}
			if(dp[n]>1){
				System.out.printf("There are %d ways to produce %d cents change.\n",dp[n],n);
			}else {
				System.out.printf("There is only %d way to produce %d cents change.\n",dp[n],n);
			}
		}

	}

}
