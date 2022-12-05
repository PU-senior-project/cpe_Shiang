package UVA;
//ACCEPTED
import java.util.Arrays;
import java.util.Scanner;

public class U10038 {

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
				arr_sub[i]=Math.abs(arr[i+1]-arr[i]);
			}
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
