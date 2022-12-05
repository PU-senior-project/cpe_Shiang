package UVA;
//ACCEPTED
import java.util.Scanner;

public class U10783 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int odd_sum=0;
			for(int j=a;j<=b;j++) {
				if(j%2==1) {
					odd_sum+=j;
				}
			}
			System.out.printf("Case %d: %d\n",i+1,odd_sum);
		}

	}

}
