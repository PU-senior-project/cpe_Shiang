package UVA;
//ACCEPTED
import java.util.Scanner;
//abcdefghijklmnopqrstuvwxyz
//01234567890123456789012345
public class U12289 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String s=sc.next();
			int[] letters=new int[26];
			for(int j=0;j<s.length();j++) {
				letters[s.charAt(j)-'a']++;
			}
			if(s.length()==5) {
				System.out.println("3");
			}else {
				if(letters[14]!=0&&letters[13]!=0||letters[14]!=0&&letters[4]!=0||letters[13]!=0&&letters[4]!=0) {
					System.out.println("1");
				}else if(letters[19]!=0&&letters[22]!=0||letters[22]!=0&&letters[14]!=0||letters[19]!=0&&letters[14]!=0) {
					System.out.println("2");
				}
			}
			
		}

	}

}
