package ZeroJudge;
import java.util.Scanner;
/*6
10 8
25 25
65 75
25 29
25 17
15 20
112=8+75+29
*/
public class 路過的鴨duckD637 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] backpack=new int[101];
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int weight=sc.nextInt(); //體積
				int value=sc.nextInt(); //飽足感
				for(int j=100;j>=weight;j--) {
					backpack[j]=Math.max(backpack[j],backpack[j-weight]+value);
				}
			}
			System.out.println(backpack[100]);
		}
	}

}
