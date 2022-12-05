package UVA;
//ACCEPTED
import java.util.Arrays;
import java.util.Scanner;

public class U11727 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int[] arr=new int[3];
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.printf("Case %d: %d\n",i+1,arr[1]);
		}

	}

}
