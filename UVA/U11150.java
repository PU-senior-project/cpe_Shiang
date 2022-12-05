package UVA;
//ACCEPTED
import java.util.Scanner;

public class U11150 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			int sum=N;
			while(N>=3) {
				sum+=N/3;
				N=N/3+N%3;
			}
			if(N==2)sum++;
			System.out.println(sum);
		}
	}

}
