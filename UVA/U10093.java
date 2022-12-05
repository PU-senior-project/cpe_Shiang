package UVA;

import java.util.Scanner;

public class U10093 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String s=sc.next();
			int max=1;
			int sum=0;
			for(int i=0;i<s.length();i++) {
				int digit=0;
				if(s.charAt(i)>=48&&s.charAt(i)<=57) {
					digit=s.charAt(i)-'0';
				}else if(s.charAt(i)>=65&&s.charAt(i)<=90) {
					digit=s.charAt(i)-'A'+10;
				}else if(s.charAt(i)>=97&&s.charAt(i)<=122) {
					digit=s.charAt(i)-'a'+36;
				}
				sum=sum+digit;
				if(digit>max) {
					max=digit;
				}
			}
			for(int i=max;i<=62;i++){
				if(i==62){
					System.out.println("such number is impossible!");
					break;
				}
				if(sum%i==0){
					System.out.println(i+1);
					break;
				}
			}
		}	

	}

}
