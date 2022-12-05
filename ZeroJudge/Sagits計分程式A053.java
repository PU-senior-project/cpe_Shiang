package ZeroJudge;

import java.util.Scanner;

public class Sagits計分程式A053 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			if(N>=0&&N<=10) {
				System.out.println(6*N);
			}else if(N>=11&&N<=20) {
				System.out.println(60+2*(N-10));
			}else if(N>=21&&N<=40) {
				System.out.println(80+1*(N-20));
			}else {
				System.out.println(100);
			}
		}
	}

}
