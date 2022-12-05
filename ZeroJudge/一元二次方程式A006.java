package ZeroJudge;
import java.util.*;
public class 一元二次方程式A006 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			while(sc.hasNext()) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int D=b*b-4*a*c;
				if(D>0) {
					System.out.printf("Two different roots x1=%d , x2=%d",(int)(-b+Math.sqrt(D))/(2*a),(int)(-b-Math.sqrt(D))/(2*a));
				}else if(D==0) {
					System.out.printf("Two same roots x=%d",(int)(-b)/(2*a));
				}else {
					System.out.printf("No real root");
				}
			}
	}

}
//一元二次方程式
//開根號之後要轉換型態