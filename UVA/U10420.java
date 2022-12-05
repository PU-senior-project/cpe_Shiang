package UVA;
//ACCEPTED
import java.util.*;

public class U10420 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		TreeMap<String,Integer> treeMap=new TreeMap<>();
		for(int i=0;i<N;i++) {
			String country=sc.next();
			if(!treeMap.containsKey(country)) {
				treeMap.put(country,1);
			}else {
				treeMap.put(country,treeMap.get(country)+1);
			}
			sc.nextLine();
		}
		for(String s:treeMap.keySet()) {
			System.out.println(s+" "+treeMap.get(s));
		}
	}

}
