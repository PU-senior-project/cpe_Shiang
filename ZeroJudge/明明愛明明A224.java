package ZeroJudge;

import java.util.Scanner;

public class 明明愛明明A224 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] alphabets=new int[26];
			int count=0;
			String s=sc.next();
			s=s.toLowerCase();
			for(int i=0;i<s.length();i++) {
				if('a'<=s.charAt(i)&&s.charAt(i)<='z') {
					alphabets[s.charAt(i)-'a']++;
				}
			}
			for(int i=0;i<alphabets.length;i++) {
				if(alphabets[i]%2!=0) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("no...");
			}else {
				System.out.println("yes !");
			}
		}

	}

}
