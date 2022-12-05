package UVA;
import java.util.*;

public class U10415 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,String> record=new HashMap<>();
		int N=Integer.parseInt(sc.nextLine());
		record.put(' ',"0000000000");
		record.put('c',"0111001111");
		record.put('d',"0111001110");
		record.put('e',"0111001100");
		record.put('f',"0111001000");
		record.put('g',"0111000000");
		record.put('a',"0110000000");
		record.put('b',"0100000000");
		record.put('C',"0010000000");
		record.put('D',"1111001110");
		record.put('E',"1111001100");
		record.put('F',"1111001000");
		record.put('G',"1111000000");
		record.put('A',"1110000000");
		record.put('B',"1100000000");
		for(int i=0;i<N;i++) {
			char temp=' ';
			String s=sc.nextLine();
			String record_value,former_value;
			int count[]=new int[10];
			for(int j=0;j<s.length();j++){			//¹M¾ús
				record_value=record.get(s.charAt(j));//¼Æ¦r
				former_value=record.get(temp);//0000000000
				for(int k=0;k<10;k++){
					if(record_value.charAt(k)=='1'&&former_value.charAt(k)=='0') {
						count[k]++;
					}
				}
				temp=s.charAt(j);
			}
			for(int j=0;j<9;j++) {
				System.out.print(count[j]+" ");
			}
			System.out.println(count[9]);
		}
	
	}
}
