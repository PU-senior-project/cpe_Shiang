package UVA;
//ACCEPTED
import java.util.*;

public class U10019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int M=sc.nextInt();
			String X=Integer.toBinaryString(M);
			int b1=0;
			for(int j=0;j<X.length();j++) {
				if(X.charAt(j)!='0') b1++;
			}
			String X2=Integer.toString(M);
			int O=0;
			for(int j=0;j<X2.length();j++) {
				O+=(int)Math.pow(16,X2.length()-1-j)*Integer.parseInt(X2.charAt(j)+"");
			}
			//System.out.println(O);
			String X3=Integer.toBinaryString(O);
			int b2=0;
			for(int j=0;j<X3.length();j++) {
				if(X3.charAt(j)!='0') b2++;
			}
			System.out.println(b1+" "+b2);
		}
	}

}
