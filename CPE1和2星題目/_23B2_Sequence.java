package CPE1和2星題目;

import java.util.Scanner;

public class _23B2_Sequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(sc.hasNext()) {
			int N=sc.nextInt();
			int[] arr=new int[N];
			boolean isB2=true;
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			if(arr[0]<1) {
				isB2=false;
			}
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<arr[i-1]) {
					isB2=false;
				}
			}
			if(isB2==false) {
				System.out.printf("Case #%d: It is not a B2-Sequence.\n\n", count++);
				continue;
			}
			boolean[] val=new boolean[20001];
			for(int i=0;i<N;i++) {
				for(int j=i;j<N;j++) {
					int sum=arr[i]+arr[j];
					if(val[sum]) {
						isB2=false;
					}else {
						val[sum]=true;
					}
				}
			}
			if(isB2) {
				System.out.printf("Case #%d: It is a B2-Sequence.\n\n",count++);
			}else {
				System.out.printf("Case #%d: It is not a B2-Sequence.\n\n",count++);
			}
		}	

	}

}
