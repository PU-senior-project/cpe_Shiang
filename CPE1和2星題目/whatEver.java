package CPE1�M2�P�D��;

import java.util.*;

public class whatEver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] answer=new int[4];
			int[] temp=new int[4];  
			for(int i=0;i<4;i++) {
				answer[i]=sc.nextInt();
				temp[i]=answer[i];    //�Ȧs���� ��n����Ƥ��
			}
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int a=0,b=0;
				int[] guess=new int[4];
				for(int j=0;j<4;j++) {
					guess[j]=sc.nextInt();
				}
				for(int j=0;j<4;j++) {
					if(answer[j]==guess[j]) {
						a++;
						answer[j]=10;   //�קK���Ƥ��
						guess[j]=10;    //�קK���Ƥ��
					}
				}
				for(int j=0;j<4;j++) {
					for(int k=0;k<4;k++) {
						if(guess[j]!=10&&guess[j]==answer[k]) {
							b++;
							break;
						}
					}
				}
				for(int j=0;j<4;j++) answer[j]=temp[j];
				System.out.println(a+"A"+b+"B");
			}
		}
	}

	
}
