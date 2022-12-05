package UVA;
//ACCEPTED
import java.util.*;
public class U00299 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int swap=0;
			int L=sc.nextInt();
			int[] arr=new int[L];
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			for(int j=0;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[j]>arr[k]) {
						int tmp=arr[j];
						arr[j]=arr[k];
						arr[k]=tmp;
						swap++;
					}
				}
			}
			System.out.printf("Optimal train swapping takes %d swaps.\n",swap);
		}

	}

}
