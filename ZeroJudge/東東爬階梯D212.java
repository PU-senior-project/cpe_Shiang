package ZeroJudge;
/*
n=1 
1 
總共1種走法

n=2 
1 1 
2
總共2種方法

n=3
n=2後再爬一階       n=1後再爬兩階
1 1  1       1  2
2 1    
總共3種方法  

n=4
n=3共三種方法       n=2共2種方法        
1 1 1  1   	 1 1  2
2 1    1	 2    2
1 2    1
總共5種方法

n個階梯
總共(n-1階方法數)+(n-2階方法數)種方法
 */
import java.util.Scanner;

public class 東東爬階梯D212 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			long[] f=new long[100];
			f[0]=1; //不走也是一種走法
			f[1]=1; 
			f[2]=2;
			for(int i=3;i<100;i++) {
				f[i]=f[i-1]+f[i-2];
			}
			System.out.println(f[n]);
		}
	}

}
