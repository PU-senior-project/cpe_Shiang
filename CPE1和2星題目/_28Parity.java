package CPE1和2星題目;

import java.util.Scanner;

public class _28Parity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int I;
		while(sc.hasNext()&&(I=sc.nextInt())!=0) {
			String s=Integer.toBinaryString(I);
			int sum=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='1') {
					sum++;
				}
			}
			System.out.printf("The parity of %s is %d (mod 2).\n",s,sum);
		}

	}

}
