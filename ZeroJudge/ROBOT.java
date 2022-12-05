package ZeroJudge;

import java.util.Scanner;

public class ROBOT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int x=0;
			int y=0;
			for(int i=0;i<n;i++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a==0) {
					y+=b;
				}else if(a==1) {
					x+=b;
				}else if(a==2) {
					y-=b;
				}else if(a==3){
					x-=b;
				}
			}
			System.out.print(x+" "+y);
		}

	}

}
