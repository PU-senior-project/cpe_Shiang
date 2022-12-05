package ZeroJudge;
import java.util.*;
public class 明明愛數數A215 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int sum=0;
			int total=0;
			while(total<=m) {
				total+=n;
				n++;
				sum++;
			}
			System.out.println(sum);
		}
	}
}
