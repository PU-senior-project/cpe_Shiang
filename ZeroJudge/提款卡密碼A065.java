package ZeroJudge;

import java.util.Scanner;

public class ´£´Ú¥d±K½XA065 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String A=sc.next();
			char[] B=A.toCharArray();
			for(int i=0;i<B.length-1;i++) {
				System.out.print(Math.abs(B[i]-B[i+1]));
			}
			System.out.println();
		}

	}

}
