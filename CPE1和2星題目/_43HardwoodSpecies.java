package CPE1和2星題目;

import java.util.Scanner;
import java.util.TreeMap;
public class _43HardwoodSpecies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(sc.hasNext()) {
			TreeMap<String,Integer> map=new TreeMap<>();
			String st;
			int count=0;
			while(sc.hasNextLine()&&!(st=sc.nextLine()).equals("")) {
				if(map.containsKey(st)) {
					map.put(st,map.get(st)+1);
				}else {
					map.put(st,1);
				}
				count++;
			}
			for(String s:map.keySet()) {
				System.out.printf("%s %.4f\n",s,map.get(s)*100.0/count);
			}
		}
		
	}

}
