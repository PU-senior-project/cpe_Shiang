package CPE1和2星題目;

import java.util.Arrays;
import java.util.Scanner;

public class _1VitosFamily {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int r=sc.nextInt();
			int[] arr=new int[r];
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			int minDistance=0;
			Arrays.sort(arr);
			for(int j=0;j<arr.length;j++) {
				minDistance+=Math.abs(arr[j]-arr[j/2]);
			}
			System.out.println(minDistance);
		}

	}

}
