package UVA;

import java.util.Scanner;

public class U10018 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			long add=1;
			long P=sc.nextLong();
			P+=Reverse(P);//一定要先反轉並相加一次 所以add初始值為1
			while(true) {
				if(isPalin(P)) {
					System.out.printf("%d %d\n",add,P);
					break;
				}else {
					P+=Reverse(P);
					add++;
				}
			}
		}
	}
	//注意String跟Long之間的轉換
	public static boolean isPalin(long n) {
		String s=Long.toString(n);
		StringBuilder str=new StringBuilder(s);
		if(s.equals(str.reverse().toString()))return true;
		return false;
	}
	public static long Reverse(long n) {
		String s=Long.toString(n);
		StringBuilder str=new StringBuilder(s);
		return Long.parseLong(str.reverse().toString());
	}
}
