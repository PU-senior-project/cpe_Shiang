package CPE1和2星題目;
import java.util.*;
public class _20BeattheSpread {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			int d=sc.nextInt();
			//a+b=s  a-b=d
			int a=(s+d)/2;
			int b=s-a;
			if(d>s||a+b!=s||a-b!=d) {
				System.out.println("impossible");
			}else {
				System.out.printf("%d %d\n",a,b);
			}
		}

	}

}
