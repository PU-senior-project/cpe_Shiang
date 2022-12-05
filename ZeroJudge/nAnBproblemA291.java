package ZeroJudge;

import java.util.Scanner;

public class nAnBproblemA291 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int answer[]=new int[4];
			int temp[]=new int[4];
			for(int i=0;i<answer.length;i++) {
				answer[i]=sc.nextInt();
				temp[i]=answer[i];
			}
			int n=sc.nextInt();
			for(int k=0;k<n;k++) {
				int a=0,b=0;
				int guess[]=new int[4];
				for(int i=0;i<guess.length;i++) {
					guess[i]=sc.nextInt();
				}
				for(int i=0;i<answer.length;i++) {
					if(answer[i]==guess[i]) {
						a++;
						answer[i]=10;
						guess[i]=10;
					}
				}
				for(int i=0;i<answer.length;i++) {
					for(int j=0;j<answer.length;j++) {
						if(guess[i]!=10&&guess[i]==answer[j]) {
							b++;
							break;
						}
					}
				}
				for(int i=0;i<answer.length;i++) {
					answer[i]=temp[i];
				}
				System.out.println(a+"A"+b+"B");
			}
		}
	}
}
/*1 2 3 4
4
1 1 4 5
1 2 4 3
1 1 4 4
4 3 2 1

1 1 1 5
4
1 1 1 1
0 9 2 8
1 5 2 3
1 1 5 1*/
