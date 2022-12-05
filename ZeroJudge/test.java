package ZeroJudge;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] m=new int[4];
			int[] temp=new int[4];
			for(int i=0;i<m.length;i++) {
				m[i]=sc.nextInt();
				temp[i]=m[i];
			}
			int n=sc.nextInt();
			for(int k=1;k<=n;k++) {
				int a=0;int b=0;
				int[] guess=new int[n];
				for(int i=0;i<guess.length;i++) {
					guess[i]=sc.nextInt();
				}
				for(int i=0;i<m.length;i++) {
					if(m[i]==guess[i]) {
						a++;
						m[i]=10;
						guess[i]=10;
					}
				}
				for(int i=0;i<m.length;i++) {
					for(int j=0;j<m.length;j++) {
						if(guess[i]!=10&&guess[i]==m[j]) {
							b++;
							break;
						}
					}
				}
				for(int i=0;i<m.length;i++) {
					m[i]=temp[i];
				}
				System.out.println(a+"A"+b+"B");
			}
		}
		
		
		
		
		

	}

}
