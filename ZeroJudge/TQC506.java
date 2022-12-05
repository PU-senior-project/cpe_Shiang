package ZeroJudge;

import java.util.Scanner;

public class TQC506 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int D=b*b-4*a*c;
			if(D>0) {
				System.out.printf("%d %d",(int)(-b+Math.sqrt(D))/(2*a),(int)(-b-Math.sqrt(D))/(2*a));
			}else if(D==0) {
				System.out.printf("Two same roots x=%d",(int)(-b)/(2*a));
			}else {
				System.out.printf("Your equation has no root.");
			}
		}

	}

}
