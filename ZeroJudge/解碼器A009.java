package ZeroJudge;
import java.util.*;
public class ¸Ñ½X¾¹A009 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String a=sc.next();
			char c[]=a.toCharArray();
			for(int i=0;i<c.length;i++) {
				c[i]-=7;
			System.out.print(c[i]);
			}
		}
	}
}
