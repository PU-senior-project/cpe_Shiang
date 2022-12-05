package CPE1和2星題目;
import java.util.*;
public class _31AllYouNeedIsLove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			String s1=sc.next(),s2=sc.next();
			int a=0,b=0;
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(j)!='0') {
					a+=Math.pow(2,s1.length()-1-j);
				}
			}
			for(int j=0;j<s2.length();j++) {
				if(s2.charAt(j)!='0') {
					b+=Math.pow(2,s2.length()-1-j);
				}
			}
			while(b!=0) {
				int r=a%b;
				a=b;
				b=r;
			}
			if(a>1) {
				System.out.printf("Pair #%d: All you need is love!\n",i+1);
			}else {
				System.out.printf("Pair #%d: Love is not all you need!\n",i+1);
			}
			
		}

	}

}
