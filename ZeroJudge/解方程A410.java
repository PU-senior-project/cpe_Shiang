package ZeroJudge;

import java.util.Scanner;

public class ¸Ñ¤èµ{A410 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			double delta=a*e-b*d;
			double deltax=c*e-b*f;
			double deltay=a*f-c*d;
			if(delta==0) {
				if(deltax==0&&deltay==0) {
					System.out.println("Too many");
				}else if(deltax!=0||deltay!=0) {
					System.out.println("No answer");
				}
			}else {
				double x;
				x=deltax/delta;
				double y;
				y=deltay/delta;
				System.out.printf("x=%.2f\n",(double)x);
				System.out.printf("y=%.2f",(double)y);
			}
		}
	}

}
