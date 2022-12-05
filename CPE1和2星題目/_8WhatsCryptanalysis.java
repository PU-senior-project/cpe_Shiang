package CPE1和2星題目;
/*3
This is a test.
Count me 1 2 3 4 5.
Wow!!!! Is this question easy?*/
import java.util.Scanner;

public class _8WhatsCryptanalysis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int[] alphabets=new int[26];
		int length=0;
		for(int i=0;i<n;i++) {
			String tmp=sc.nextLine().toUpperCase();
			length+=tmp.length();
			for(int j=0;j<tmp.length();j++) {
				if('A'<=tmp.charAt(j)&&tmp.charAt(j)<='Z') {
					alphabets[tmp.charAt(j)-'A']++;
				}
			}
		}
		while(--length>0) {
			for(int i=0;i<alphabets.length;i++) {
				if(alphabets[i]==length) {
					System.out.println((char)(i+65)+" "+length);
				}
			}
		}
	}
}
