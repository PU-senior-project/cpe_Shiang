package ZeroJudge;

import java.util.Scanner;

public class 質數又來囉A121 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int total=0;
			if(a>b)System.out.println("0");
			for(int i=a;i<=b;i++) {
				boolean flag=true;
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						flag=false;
					}
				}
				if(flag) {
					total++;
				}
			}
			System.out.println(total);
		}
	}

}
