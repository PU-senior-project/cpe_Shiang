package CPE1和2星題目;

import java.util.Scanner;

public class _13TeXQuotes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(sc.hasNext()) {
			String s=sc.nextLine();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='"'&&count%2==0) {
					System.out.print("``");
					count++;
				}else if(s.charAt(i)=='"'&&count%2==1){
					System.out.print("''");
					count++;
				}else {
					System.out.print(s.charAt(i));
				}
			}
			System.out.println();
		}
	}

}
