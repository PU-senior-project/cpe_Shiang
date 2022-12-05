package ZeroJudge;

import java.util.Scanner;

public class 明明愛排列A225 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] m=new int[n];
			for(int i=0;i<m.length;i++) {
				m[i]=sc.nextInt();
			}
			for(int i=0;i<m.length;i++) {
				for(int j=i+1;j<m.length;j++) {
					if(m[i]%10>m[j]%10) {
						int temp;
						temp=m[i];
						m[i]=m[j];
						m[j]=temp;
					}
				}
			}
			for(int i=0;i<m.length;i++) {
				for(int j=i+1;j<m.length;j++) {
					if(m[i]%10==m[j]%10) {
						if(m[i]<m[j]) {
							int temp;
							temp=m[i];
							m[i]=m[j];
							m[j]=temp;
						}
					}
				}
			}
			for(int i=0;i<m.length;i++) {
				System.out.print(m[i]+" ");
			}
		}

	}

}
/*
7
38 106 98 26 13 46 51
6
1 2 3 4 5 0
5
98 76 12 34 55
6
33 33 88 88 83 38
*/