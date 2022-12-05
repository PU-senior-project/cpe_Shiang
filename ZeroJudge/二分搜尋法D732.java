package ZeroJudge;
import java.util.*;
public class ¤G¤À·j´MªkD732 {
/*5 5
1 3 4 7 9
3 1 9 7 -2*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] arr=new int[n];
			int[] num=new int[k];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<num.length;i++) {
				num[i]=sc.nextInt();
			}
			for(int i=0;i<num.length;i++) {
				int result=bin(arr,num[i]);
				System.out.println(result);
			}
		}
	}
	public static int bin(int[] arr,int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]<target) {
				left=mid+1;
			}else if(arr[mid]>target) {
				right=mid-1;
			}else {
				return mid+1;
			}
		}
		return 0;
	}

}
