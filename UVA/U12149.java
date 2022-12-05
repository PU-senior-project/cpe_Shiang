package UVA;
//ACCEPTED
import java.util.*;
public class U12149 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			if(N==0) break;
			System.out.println((N*(N+1)*(2*N+1))/6);
		}

	}

}
