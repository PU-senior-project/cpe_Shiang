package ZeroJudge;
import java.util.*;
public class 完全平方和A059 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=0;
			for(int j=1;j<=1000;j++) {
				if(j*j>=a&&j*j<=b) {
					sum+=j*j;
				}
			}
			System.out.println("Case "+(i+1)+": "+sum);
		}
	}
}
