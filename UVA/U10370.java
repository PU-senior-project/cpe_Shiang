package UVA;
//ACCEPTED
import java.util.Scanner;

public class U10370 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C=sc.nextInt();
		for(int i=0;i<C;i++) {
			int N=sc.nextInt();
			int[] grades=new int[N];
			for(int j=0;j<grades.length;j++) {
				grades[j]=sc.nextInt();
			}
			int total=0;
			for(int j=0;j<grades.length;j++) {
				total+=grades[j];
			}
			int average=total/N;
			double count=0;
			for(int j=0;j<grades.length;j++) {
				if(grades[j]>average) count++;
			}
			System.out.printf("%.3f%%\n",count/N*100);
		}
	}
}
