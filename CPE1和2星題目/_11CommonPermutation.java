package CPE1和2星題目;
/*pretty
women
walking
down
the
street*/
import java.util.Scanner;

public class _11CommonPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String a=sc.nextLine();
			String b=sc.nextLine();
			int[] arr=new int[26];
			int[] brr=new int[26];
			for(int i=0;i<a.length();i++) {
				arr[a.charAt(i)-'a']++;
			}
			for(int i=0;i<b.length();i++) {
				brr[b.charAt(i)-'a']++;
			}
			for(int i=0;i<26;i++) {
				int min=Math.min(arr[i],brr[i]);
				for(int j=0;j<min;j++) {
					System.out.print((char)(i+97));
				}
			}
			System.out.println();
		}

	}

}
