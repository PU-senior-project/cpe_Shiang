package UVA;
import java.util.*;
import java.util.HashMap;
public class U12250{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,String> map=new HashMap<>();
		map.put("HELLO", "ENGLISH");
		map.put("HOLA", "SPANISH");
		map.put("HALLO", "GERMAN");
		map.put("BONJOUR", "FRENCH");
		map.put("CIAO", "ITALIAN");
		map.put("ZDRAVSTVUJTE", "RUSSIAN");
		
		int num=1;
		while(sc.hasNext()) {
			String s=sc.next();
			if(s=="#")break;
			if(map.containsKey(s)) {
				System.out.println("Case "+num+": "+map.get(s));
			}else {
				System.out.println("Case "+num+": UNKNOWN");
			}
			num++;
		}

	}

}
/*HELLO
HOLA
HALLO
BONJOUR
CIAO
ZDRAVSTVUJTE
#*/