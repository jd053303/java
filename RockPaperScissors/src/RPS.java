/*6.18*/
import java.util.Scanner;

public class RPS {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double rand = Math.random();
		int pc = (int)(rand*3)+1;
		System.out.println("!Rock-paper-Scissors game with PC!");
		System.out.println("1.Scissors  2.Rock  3.Paper");
		System.out.println("\rME : ");
		int me = scan.nextInt();
		int a = pc + me;
		
		System.out.print("\rPC : ");
		han(pc);
		System.out.print("ME : ");
		han(me);
		
		if(pc==me) System.out.println("\r\r!DRAW!");
		else if(a==4) {
			if(me<pc) System.out.println("\r\r!WIN!");
			else System.out.println("\r\r!LOSE!");
			}
		else {
			if(me>pc) System.out.println("\r\r!WIN!");
			else System.out.println("\r\r!LOSE!");
		}
	}
	
	private static void han (int h) {
		if(h==1) System.out.println("Scissors");
		else if(h==2) System.out.println("Rock");
		else System.out.println("Paper");	
	}
}
