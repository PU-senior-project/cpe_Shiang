package UVA;

import java.util.Scanner;

public class U11689 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		for(int i=0;i<N;i++) {
			String s=sc.next();
			int[] frequency=new int[62];//10+26+26
			System.out.printf("Case %d: ",i+1);
			for(int j=0;j<s.length();j++) {
				if('0'<=s.charAt(j)&&s.charAt(j)<='9') {
					frequency[s.charAt(j)-'0']++;
				}else if('A'<=s.charAt(j)&&s.charAt(j)<='Z') {
					frequency[s.charAt(j)-'A'+10]++;
				}else if('a'<=s.charAt(j)&&s.charAt(j)<='z') {
					frequency[s.charAt(j)-'a'+36]++;
				}
			}
			//如果沒有質數
			int notEmpty=0;
			for(int j=0;j<frequency.length;j++) {
				boolean flag=true;
				if(frequency[j]<2)continue;
				int index=frequency[j];
				for(int k=2;k<=Math.sqrt(index);k++) {
					if(index%k==0) {//有質數
						flag=false;
						break;
					}
				}
				if(flag) {
					if(j<10) {
						System.out.print((char)(j+'0'));
					}else if(10<=j&&j<36) {
						System.out.print((char)(j-10+'A'));
					}else if(36<=j&&j<=62) {
						System.out.print((char)(j-36+'a'));
					}
					notEmpty++;
				}
			}
			if(notEmpty==0) {
				System.out.print("empty");
			}
			System.out.println();
		}
			
		
		
	}

}
