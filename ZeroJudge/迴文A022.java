package ZeroJudge;
import java.util.*;
public class ∞j§ÂA022 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String a=sc.nextLine();
			int b=a.length()/2;
			int sum=0;
			for(int i=0;i<b;i++) {
				if(a.charAt(i)==a.charAt(a.length()-1-i)) {
					sum++;
				}
			}
			if(sum==b) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}

	}

}
