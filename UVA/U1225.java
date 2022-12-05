package UVA;
//ACCEPTED
import java.util.Scanner;

public class U1225 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sets=sc.nextInt();
		for(int i=0;i<sets;i++) {
			int number=sc.nextInt();
			//String s="";
			int[] digit=new int[10];
			for(int j=1;j<=number;j++) {
				int index=j;
				while(index!=0) {
					digit[index%10]++;
					index/=10;
				}
			}
			System.out.print(digit[0]);
			for(int j=1;j<=9;j++) {
				System.out.print(" "+digit[j]);
			}
			System.out.println();
		}

	}

}
