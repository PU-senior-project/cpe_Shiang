package CPE1和2星題目;
/*123 456
555 555
123 594
0 0*/
import java.util.Scanner;

public class _3PrimaryArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0)break;
			int carry=0;
			int times=0;
			while(a!=0||b!=0) {
				if(a%10+b%10+carry>=10) {
					carry=1;
					times++;
				}else {
					carry=0;
				}
				a/=10;
				b/=10;
			}
			if(times==0) {
				System.out.println("No carry operation.");
			}else if(times==1) {
				System.out.println("1 carry operation.");
			}else {
				System.out.printf("%d carry operations.\n",times);
			}
		}

	}

}
