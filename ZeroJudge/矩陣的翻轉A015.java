package ZeroJudge;
import java.util.*;
public class ¯x°}ªºÂ½ÂàA015 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int row=sc.nextInt();//row ¦C
			int col=sc.nextInt();//column ¦æ
			int matrix[][]=new int[col][row];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					matrix[j][i]=sc.nextInt();
				}
			}
			for(int i=0;i<col;i++) {
				for(int j=0;j<row;j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
/*2 3
3 1 2
8 5 4*/
