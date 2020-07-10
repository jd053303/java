/* 6.18 / 7.10 */ 
import java.util.Scanner;

public class RPS {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int l=0;
		do {
			if( l==1 ) clearScreen();
			double rand = Math.random();
			int pc = (int) (rand * 3) + 1;
			System.out.println("!Rock-paper-Scissors game with PC!");
			System.out.println("1.Scissors  2.Rock  3.Paper");
			System.out.print("\rME : ");
			int me = scan.nextInt();
			int a = pc + me;

			System.out.print("\nPC : ");
			han(pc);
			System.out.print("ME : ");
			han(me);

			if (pc == me) System.out.println("   !DRAW!");
			else if (a == 4) {
				if (me < pc) System.out.println("   !WIN!");
				else System.out.println("   !LOSE!");
			} else {
				if (me > pc) System.out.println("   !WIN!");
				else System.out.println("   !LOSE!");
			}

			System.out.println("\n다시 하고 싶으면 1을 누르세요.");
			l = scan.nextInt();
		}while(l==1);
	}

	private static void han ( int h){
		if (h == 1) System.out.println("Scissors");
		else if (h == 2) System.out.println("Rock");
		else System.out.println("Paper");
	}

	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}

