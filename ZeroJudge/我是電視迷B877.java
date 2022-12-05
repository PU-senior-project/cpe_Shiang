package ZeroJudge;

import java.util.Scanner;

public class 我是電視迷B877 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a>b?100+b-a:b-a;
			System.out.println(c);
		}
	}

}
