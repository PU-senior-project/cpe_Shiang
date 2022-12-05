package UVA;
//ACCEPTED
import java.util.Scanner;

public class U10922 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String s=sc.next();
			if(s.equals("0"))break;
			String tmp=s;
			int count=0;
			while(true) {
				int total=0;
				for(int i=0;i<tmp.length();i++) {
					total+=tmp.charAt(i)-'0';
				}
				if(total%9==0) {
					count++;
					if(total==9) break;
					else tmp=Integer.toString(total);
				}else {
					break;
				}
			}
			if(count==0) {
				System.out.printf("%s is not a multiple of 9.\n",s);
			}else {
				System.out.printf("%s is a multiple of 9 and has 9-degree %d.\n",s,count);
			}
		}
	}

}
