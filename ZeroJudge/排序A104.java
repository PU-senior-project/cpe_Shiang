package ZeroJudge;
import java.util.*;
public class ±Æ§ÇA104 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int temp=0;
			int m[]=new int[n];
			for(int i=0;i<n;i++) {
				m[i]=sc.nextInt();
			}
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m.length;j++) {
					if(m[i]<m[j]) {
						temp=m[i];
						m[i]=m[j];
						m[j]=temp;
					}
				}
			}
			for(int i=0;i<m.length;i++) {
				System.out.print(m[i]+" ");
			}
		}
	}
}
