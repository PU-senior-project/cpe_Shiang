package UVA;
//ACCEPTED
import java.util.*;
public class U11734 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String s1=sc.nextLine();
			String s2=sc.nextLine();//judge¿é¥X
			System.out.printf("Case %d: ",i+1);
			if(s1.equals(s2)) {
				System.out.println("Yes");
			}else {
				s1=s1.replace(" ","");
				if(s1.equals(s2)) {
					System.out.println("Output Format Error");
				}else {
					System.out.println("Wrong Answer");
				}
			}
		}
	}

}
