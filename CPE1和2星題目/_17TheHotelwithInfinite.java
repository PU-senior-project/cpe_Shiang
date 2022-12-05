package CPE1和2星題目;

import java.util.Scanner;

public class _17TheHotelwithInfinite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			long S=sc.nextLong();
			long D=sc.nextLong();
			long members=S;
			while(members<D) {
				S++;
				members+=S;
			}
			System.out.println(S);
		}

	}

}
