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
public class ���L���nduckD637 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] backpack=new int[101];
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int weight=sc.nextInt(); //��n
				int value=sc.nextInt(); //�����P
				for(int j=100;j>=weight;j--) {
					backpack[j]=Math.max(backpack[j],backpack[j-weight]+value);
				}
			}
			System.out.println(backpack[100]);
		}
	}

}
