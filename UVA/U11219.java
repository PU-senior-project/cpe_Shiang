package UVA;
//ACCEPT
import java.util.Scanner;
//4
//01/01/2007   �{�b
//10/02/2007   �X��
//09/06/2007
//28/02/1871
//12/11/2007
//01/01/1984
//28/02/2005
//29/02/2004
//Case #1: Invalid birth date
//Case #2: Check birth date
//Case #3: 23
//Case #4: 0
public class U11219 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			sc.nextLine();
			String currentDate=sc.next();
			String birthDate=sc.next();
			String[] c=currentDate.split("/");
			String[] b=birthDate.split("/");
			//  1:current 2:birth
			//  ��/��/�~
			int d1=Integer.parseInt(c[0]);
			int d2=Integer.parseInt(b[0]);
			int m1=Integer.parseInt(c[1]);
			int m2=Integer.parseInt(b[1]);
			int y1=Integer.parseInt(c[2]);
			int y2=Integer.parseInt(b[2]);
			System.out.printf("Case #%d: ",i+1);
			if(y2>y1) {//�٨S�X��
				System.out.println("Invalid birth date");
			}else if(y2==y1) {//�褸�P�@�~�X��  
				if(m2>m1) {//�٨S�X��
					System.out.println("Invalid birth date");
				}else if(m2==m1) {
					if(d2>d1) {//�٨S�X��
						System.out.println("Invalid birth date");
					}else {
						System.out.println("0");//����@�� �ҥH��0
					}
				}else {//�w�X��
					System.out.println("0");   //����@�� �ҥH��0
				}
			}else {//�w�X�ͥB���P�~��  ���B�ݭn�P�_�O�_�w�L�ͤ�
				if(m2>m1) { //���ͤ�(-1)
					if(y1-y2-1>130) {
						System.out.println("Check birth date");
					}else {
						System.out.printf("%d\n",y1-y2-1);
					}
				}else if(m2==m1) {  
					if(d2>d1) {  //���ͤ�
						if(y1-y2-1>130) {
							System.out.println("Check birth date");
						}else {
							System.out.printf("%d\n",y1-y2-1);
						}
					}else {  //�w�ͤ�
						if(y1-y2>130) {
							System.out.println("Check birth date");
						}else {
							System.out.printf("%d\n",y1-y2);
						}
					}
				}else {//�w�ͤ� (m1>m2)
					if(y1-y2>130) {
						System.out.println("Check birth date");
					}else {
						System.out.printf("%d\n",y1-y2);
					}
				}
			}
		}

	}

}
