package ZeroJudge;

import java.util.*;

public class ¼Æ¦rÂ½ÂàA038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (a % 10 == 0)
			a /= 10;
		String s = "";
		while (a != 0) {
			s += a % 10;
			a /= 10;
		}
		System.out.println(s);

	}

}
