package CPE1和2星題目;

import java.util.Scanner;

public class _9DecodetheMadman {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		while(sc.hasNext()) {
			String a=sc.nextLine().toLowerCase();
			for(int i=0;i<a.length();i++) {
				for(int j=0;j<s.length();j++) {
					if(a.charAt(i)==s.charAt(j)) {
						System.out.print(s.charAt(j-2));
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
