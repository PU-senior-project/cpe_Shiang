package ZeroJudge;
/*
n=1 
1 
�`�@1�ب��k

n=2 
1 1 
2
�`�@2�ؤ�k

n=3
n=2��A���@��       n=1��A���ⶥ
1 1  1       1  2
2 1    
�`�@3�ؤ�k  

n=4
n=3�@�T�ؤ�k       n=2�@2�ؤ�k        
1 1 1  1   	 1 1  2
2 1    1	 2    2
1 2    1
�`�@5�ؤ�k

n�Ӷ���
�`�@(n-1����k��)+(n-2����k��)�ؤ�k
 */
import java.util.Scanner;

public class �F�F������D212 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			long[] f=new long[100];
			f[0]=1; //�����]�O�@�ب��k
			f[1]=1; 
			f[2]=2;
			for(int i=3;i<100;i++) {
				f[i]=f[i-1]+f[i-2];
			}
			System.out.println(f[n]);
		}
	}

}
