package UVA;
//TLE
import java.util.Scanner;

public class U11743 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String s=sc.nextLine().replace(" ","");
			int[] arr=new int[16];
			for(int j=0;j<s.length();j++) {
				arr[j]=Integer.parseInt(s.charAt(j)+"");
			}
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				if(j%2==0) {
					sum+=arr[j]*2%10+arr[j]*2/10;
				}else {
					sum+=arr[j];
				}
			}
			if(sum%10==0) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}
	}

}
