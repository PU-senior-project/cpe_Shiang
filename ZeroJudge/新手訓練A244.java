package ZeroJudge;
import java.util.*;
public class ·s¤â°V½mA244 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				long c=sc.nextLong();
				switch(a) {
				case 1:
					System.out.println(b+c);
				break;
				case 2:
					System.out.println(b-c);
				break;
				case 3:
					System.out.println(b*c);
				break;
				case 4:
					System.out.println(b/c);
				break;
				}
			}
		}

	}

}
/*4
1 2 3
2 2 3
3 2 3
4 2 3*/