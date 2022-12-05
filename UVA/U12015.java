package UVA;
//ACCEPTED
import java.util.Scanner;

public class U12015 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String[] websites=new String[10];
			int[] relatives=new int[10];
			int most=0;
			for(int j=0;j<10;j++) {
				websites[j]=sc.next();
				relatives[j]=sc.nextInt();
				if(relatives[j]>most) {
					most=relatives[j];
				}
			}
			System.out.printf("Case #%d:\n",i+1);
			for(int j=0;j<10;j++) {
				if(relatives[j]==most) {
					System.out.println(websites[j]);
				}
			}
		}

	}

}
