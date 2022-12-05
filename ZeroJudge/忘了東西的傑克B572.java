package ZeroJudge;

import java.util.Scanner;

public class 忘了東西的傑克B572 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int N=sc.nextInt();
			for(int i=0;i<N;i++) {
				int a=sc.nextInt();//20
				int b=sc.nextInt();//55
				int c=sc.nextInt();//21
				int d=sc.nextInt();//12
				int e=sc.nextInt();//20
				if(a==c) {
					int result=d-b;
					if(result>=e) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
				}
				if(a!=c) {
					int A=(60*c+d)-(60*a+b);//17
					if(A>=e) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
				}
			}
		}
	}
}
