package CPE1和2星題目;
import java.util.*;
public class _33SimplyEmirp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String s=sc.next();
			if(isPrime(Integer.parseInt(s))) {
				StringBuilder str=new StringBuilder(s);
				String a=str.reverse().toString();
				if(isPrime(Integer.parseInt(a))&&!a.equals(s)) {
					System.out.printf("%s is emirp.\n",s);
				}else {
					System.out.printf("%s is prime.\n",s);
				}
			}else {
				System.out.printf("%s is not prime.\n",s);
			}
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
