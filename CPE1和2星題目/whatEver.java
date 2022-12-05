package CPE1和2星題目;

import java.util.*;

public class whatEver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] answer=new int[4];
			int[] temp=new int[4];  
			for(int i=0;i<4;i++) {
				answer[i]=sc.nextInt();
				temp[i]=answer[i];    //暫存答案 有n筆資料比對
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
						answer[j]=10;   //避免重複比對
						guess[j]=10;    //避免重複比對
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
