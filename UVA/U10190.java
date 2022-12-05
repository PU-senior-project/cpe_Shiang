package UVA;
//ACCEPTED
import java.util.Scanner;

public class U10190 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int init=1;
			while(init<n&&m>=2) {
				init*=m;
			}
			if(init==n&&n>=m&&m>=2) {
				System.out.print(n);
				for(int i=n/m;i>=1;i/=m) {
					System.out.print(" "+i);
				}
				System.out.println();
			}else {
				System.out.println("Boring!");
			}
		}
	}

}
