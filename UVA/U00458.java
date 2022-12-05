package UVA;
//WRONG ANSWER
import java.util.Scanner;

public class U00458 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String s=sc.nextLine(),S="";
			for(int i=0;i<s.length();i++) {
				S=S+(char)(s.charAt(i)-7);
			}
			System.out.println(S);
		}

	}

}
