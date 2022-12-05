package CPE1和2星題目;
import java.util.*;
import java.util.TreeMap;
public class _7ListofConquests {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		TreeMap<String,Integer> map=new TreeMap<>();
		for(int i=0;i<N;i++) {
			String country=sc.next();
			if(map.containsKey(country)) {
				map.put(country,map.get(country)+1);
			}else {
				map.put(country,1);
			}
			sc.nextLine();
		}
		for(String s:map.keySet()) {
			System.out.println(s+" "+map.get(s));
		}
		
	}
}
