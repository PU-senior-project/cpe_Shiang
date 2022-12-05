package ZeroJudge;
import java.util.*;
public class 文文的求婚A004 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n=sc.nextInt();
			if(n%4==0&&n%100!=0||n%400==0) {
				System.out.println("閏年");
			}else {
				System.out.println("平年");
			}
		}
	}
}
