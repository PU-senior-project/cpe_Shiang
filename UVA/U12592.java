package UVA;
//ACCEPTED
import java.util.Scanner;

public class U12592 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] arr=new String[n*2];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		int m=Integer.parseInt(sc.nextLine());
		String[] brr=new String[m];
		for(int i=0;i<brr.length;i++) {
			brr[i]=sc.nextLine();
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n*2;j++) {
				if(arr[j].equals(brr[i])) {
					System.out.print(arr[j+1]);
				}
			}
			System.out.println();
		}
	}
}
