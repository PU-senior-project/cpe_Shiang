package ZeroJudge;
import java.util.*;
public class TQC107 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			double a=sc.nextInt();
			double b=sc.nextInt();
			double c=sc.nextInt();
			double d=sc.nextInt();
			double e=sc.nextInt();
			System.out.printf("%.1f %.1f %.1f %.1f %.1f\n",a,b,c,d,e);
			System.out.printf("Sum = %.1f\n",a+b+c+d+e);
			System.out.printf("Average = %.1f",(a+b+c+d+e)/5);
		}
	}

}
