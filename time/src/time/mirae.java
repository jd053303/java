package time;

import java.util.Scanner;

public class mirae {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int month = mon();
		int mon = month;
		int day = da(mon);
		int hour = hou();
		
		System.out.println("현재 : "+month+"월 "+day+"일 "); 
		ttt(hour);
		
		System.out.println("몇 시간 후의 시간을 알려드릴까요? ");
		int over = sc.nextInt();
		int tt = hour + over ;
		
		if(tt>23) {
			int a = tt/24;
			day+=a;
			tt-=(24*a);
		}
		if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&day>31) { 
			month += (day / 31);
			day %= 31;
		}
		else if((month==4||month==6||month==9||month==11)&&day>30) { 
			month += (day / 30);
			day %= 30;
		}
		else if(month==2&&day>28) { 
			month += (day / 28);
			day %= 28;
		}
		if(month>12) { 
			month %= 12;
		}
		
		System.out.println(""+month+"월 "+day+"일");
		ttt(tt);
	}
	
	private static void ttt(int a) {
		if(a>12) {
			a=a-12;
			System.out.println("오후"+ a);
		}
		else System.out.println("오전"+ a);
	}

	private static int hou() {
		double rand = Math.random();
		int hour = (int)(rand*23)+0;
		
		return hour;
	}

	private static int da(int a) {
		double rand = Math.random();
		if(a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
			 a = (int)(rand*31)+1;
		}
		else if(a==4||a==6||a==9||a==11 ) {
			 a = (int)(rand*30)+1;
		}
		else {
			 a = (int)(rand*28)+1;
		}
		
		return a;
	}

	private static int mon() {
		double rand = Math.random();
		int month = (int)(rand*12)+1;
		return month;
	}

}
