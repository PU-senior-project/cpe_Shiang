package CPE1和2星題目;
//0-9  A-Z   a-z
//0-9  10-35 36-61
//aab2 可以被n-1整除
//36 36 37 2
//max=37 sum=36+36+37+2=111
//111%37=0 ans=37+1=38
import java.util.Scanner;

public class _25AnEasyProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String s=sc.nextLine();
			int max=1,sum=0;
			for(int i=0;i<s.length();i++) {
				int digit=0;
				if(s.charAt(i)>=48&&s.charAt(i)<=57) {
					digit+=s.charAt(i)-'0';
				}else if(s.charAt(i)>=65&&s.charAt(i)<=90) {
					digit+=s.charAt(i)-'A'+10;
				}else if(s.charAt(i)>=97&&s.charAt(i)<=122) {
					digit+=s.charAt(i)-'a'+36;
				}
				sum+=digit;
				if(digit>max) {
					max=digit;
				}
			}
			for(int i=max;i<=62;i++){
				if(sum%i==0){
					System.out.println(i+1);
					break;
				}
				if(i==62){
					System.out.println("such number is impossible!");
					break;
				}
			}
		}	
	}
}
