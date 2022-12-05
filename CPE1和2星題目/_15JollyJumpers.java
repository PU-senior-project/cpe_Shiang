package CPE1和2星題目;

import java.util.Arrays;
import java.util.Scanner;

public class _15JollyJumpers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int[] arr_sub=new int[n-1];
			for(int i=0;i<arr_sub.length;i++) {
				arr_sub[i]=Math.abs(arr[i]-arr[i+1]);
			}
//			for(int i=0;i<arr_sub.length;i++) {
//				System.out.print(arr_sub[i]);
//			}
			Arrays.sort(arr_sub);
			boolean flag=true;
			for(int i=0;i<arr_sub.length;i++) {
				if(arr_sub[i]!=i+1) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("Jolly");
			}else {
				System.out.println("Not jolly");
			}
		}

	}

}
