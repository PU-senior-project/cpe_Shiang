package CPE1和2星題目;
/*1 10
100 200
201 210
900 1000*/
import java.util.Scanner;

public class _4The3nPlus1Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int min=Math.min(a,b);
			int max=Math.max(a,b);
			int maxLength=0;
			//int maxNumber=0;
			for(int i=min;i<=max;i++) {
				int length=1;
				int index=i;
				while(index!=1) {
					if(index%2==0) {
						index/=2;
					}else {
						index=index*3+1;
					}
					length++;
				}
				if(length>maxLength) {
					maxLength=length;
					//maxNumber=i;
				}
			}
			System.out.println(a+" "+b+" "+maxLength);
			//System.out.println(a+" "+b+" "+maxLength+" "+maxNumber);
		}

	}

}
