package ZeroJudge;

import java.util.Scanner;

public class 數數愛明明A216 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			long n=sc.nextLong();
			System.out.print(fib(n)+" ");
			System.out.println(gin(n));
			
		}

	}
	public static long fib(long n) {
		return ((1 + n) * n) / 2;
	}
	public static long gin(long n) {
		if (n==1) {
			return 1;
		}
		return fib(n)+gin(n-1);
	}
}
