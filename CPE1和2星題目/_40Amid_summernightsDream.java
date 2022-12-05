package CPE1和2星題目;
import java.util.*;
public class _40Amid_summernightsDream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			int[] arr=new int[N];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int mid=arr[(arr.length-1)/2];
			int mid2=arr[arr.length/2];
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==mid||arr[i]==mid2) {
					count++;
				}
			}
			int D=mid2-mid+1;
			System.out.println(mid+" "+count+" "+D);
		}
	}

}
