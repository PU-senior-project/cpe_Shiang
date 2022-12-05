package UVA;

import java.util.Scanner;

public class U10018 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			long add=1;
			long P=sc.nextLong();
			P+=Reverse(P);//�@�w�n������ìۥ[�@�� �ҥHadd��l�Ȭ�1
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
	//�`�NString��Long�������ഫ
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
