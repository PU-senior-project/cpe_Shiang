package ZeroJudge;

import java.util.Scanner;

public class �̤j���]��A738 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			while(b!=0) {
				int r=a%b;
				a=b;
				b=r;
			}
			System.out.println(a);
		}
	}

}
