package UVA;
//WRONG ANSWER
import java.util.*;
public class U00494 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s=sc.nextLine();
			String[] q=s.split("\\W+");
			System.out.println(q.length);
		}

	}

}
