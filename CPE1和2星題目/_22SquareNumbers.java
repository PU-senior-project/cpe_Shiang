package CPE1�M2�P�D��;
import java.util.*;
public class _22SquareNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0) break;
			int count=0;
			for(int i=a;i<=b;i++) {
				for(int j=1;j<=Math.sqrt(i);j++) {
					if(j*j==i) {
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}

}
