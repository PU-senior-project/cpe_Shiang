package UVA;
//ACCEPTED
import java.util.Scanner;

public class U10082 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while(sc.hasNext()) {
			String a=sc.nextLine();
			for(int i=0;i<a.length();i++) {
				for(int j=0;j<s.length();j++) {
					if(a.charAt(i)==s.charAt(j)) {
						System.out.print(s.charAt(j-1));
					}
				}
				if(a.charAt(i)==' ') {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
