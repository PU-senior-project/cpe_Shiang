package ZeroJudge;

import java.math.BigInteger;
import java.util.Scanner;

public class §jº∆πB∫‚A021 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			BigInteger a=new BigInteger(sc.next());
			String op=sc.next();
			BigInteger b=new BigInteger(sc.next());
			if(op.equals("*")) {
				System.out.println(a.multiply(b));
			}else if(op.equals("+")) {
				System.out.println(a.add(b));
			}else if(op.equals("-")) {
				System.out.println(a.subtract(b));
			}else if(op.equals("/")){
				System.out.println(a.divide(b));
			}
		}
	}

}
