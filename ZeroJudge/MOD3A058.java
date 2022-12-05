package ZeroJudge;
import java.util.*;
public class MOD3A058 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;int b=0;int c=0;
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m[]=new int[n];
			for(int i=0;i<n;i++) {
				m[i]=sc.nextInt();
				if(m[i]%3==0) {
					a++;
				}else if(m[i]%3==1) {
					b++;
				}else if(m[i]%3==2) {
					c++;
				}
			}
			System.out.printf("%d %d %d",a,b,c);
		}
	}
}
