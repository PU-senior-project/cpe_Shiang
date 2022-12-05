package ZeroJudge;
import java.util.*;
public class  Eva的回家作業A005 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			System.out.print(a+" "+b+" "+c+" "+d+" ");
			if(a+c==2*b&&b+d==2*c) {
				System.out.println(2*d-c);
			}else{
				System.out.println(d*d/c);
			}
		}
	}
}
