package CPE1㎝2琍肈ヘ;
//计㎝-案计㎝琌11计
import java.util.Scanner;

public class _5YouCanSay11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String N=sc.next();
			if(N.equals("0"))break;
			int odd=0,even=0;
			for(int i=0;i<N.length();i++) {
				if(i%2==0) {
					even+=N.charAt(i)-'0';
				}else {
					odd+=N.charAt(i)-'0';
				}
			}
			if((odd-even)%11==0) {
				System.out.printf("%s is a multiple of 11.\n",N);
			}else {
				System.out.printf("%s is not a multiple of 11.\n",N);
			}
		}

	}

}
