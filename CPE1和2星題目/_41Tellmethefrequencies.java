package CPE1和2星題目;

import java.util.Scanner;

public class _41Tellmethefrequencies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=0;
		while(sc.hasNextLine()) {
		    if((cases++)!=0) System.out.println("");
	    	String s=sc.nextLine();
	    	int[] arr=new int[127];
	    	int max=0;
	    	for(int i=0;i<s.length();i++){
	    		arr[s.charAt(i)]++;
	    	}
	    	for(int i=0;i<arr.length;i++) {
	    		if(arr[i]>max) max=arr[i];
	    	}
	    	for(int i=1;i<=max;i++) {
	    		for(int j=arr.length-1;j>=1;j--) {
	    			if(arr[j]==i) {
	    				System.out.println(j+" "+arr[j]);
	    			}
	    		}
	    	}  	
	    }
	}
}
