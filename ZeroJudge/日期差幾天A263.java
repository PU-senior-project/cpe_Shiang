package ZeroJudge;
/*
2011 10 19
2011 10 18*/
import java.util.Scanner;

public class ����t�X��A263 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int year1=sc.nextInt();
			int month1=sc.nextInt();
			int day1=sc.nextInt();
			int year2=sc.nextInt();
			int month2=sc.nextInt();
			int day2=sc.nextInt();
			System.out.println(Math.abs(year_day(year1,month1,day1)
					-year_day(year2,month2,day2)));
		}
		
	}
	public static int year_day(int year,int month,int day) {
		int days=0;
		for(int i=1;i<year;i++) {
			if(isLeap(i)) {   //�o��`�N�O��Ji
				days+=366;
			}else {
				days+=365;
			}
		}
		//�p�G��~�O�|�~�ĥ�Leap�_�hnotLeap
		for (int i=0;i<month;i++){
	         int[] notLeap= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	         int[] Leap= {0,31,29,31,30,31,30,31,31,30,31,30,31};
	         if(isLeap(year)) {
	        	 days+=Leap[i];
	         }else {
	        	 days+=notLeap[i];
	         }
		}
		return days+day;
	}
	public static boolean isLeap(int year) {
		if(year%4==0&&year%100!=0||year%400==0) {
			return true;
		}
		return false;
	}

}
