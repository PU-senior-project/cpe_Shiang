package ZeroJudge;
import java.util.*;
public class YouCannotPassA148 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=sc.nextInt();
			}
			if(sum>n*59) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
		}

	}

}
