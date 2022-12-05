package CPE1和2星題目;

import java.util.Scanner;

public class _10SummingDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		if(n==0)break;
//		while(n/10!=0) {
//			n=n/10+n%10;
//		}
//		System.out.println(n);
		while(sc.hasNext()) {
			String s=sc.next();
			if(s.equals("0")) break;
			int sum=0;
			while(s.length()!=1) {
				for(int i=0;i<s.length();i++) {
					sum+=s.charAt(i)-'0';
				}
				s=Integer.toString(sum);
				sum=0;
			}
			System.out.println(s);
		}
	}
}
