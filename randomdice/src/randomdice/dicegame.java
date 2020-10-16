package randomdice;

import java.util.Scanner;

public class dicegame {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int i;
		int ch[] = new int[3]; 
		double rand = Math.random();
		int dice = (int)(rand * 6) + 1;
		int a = 0;

		do {
			int me = scan.nextInt();
			for(i=0; i<3; i++) {
				if(me>6) {
					System.out.println("주사위는 1~6까지만 있어용\n");
					break;
				}
				if(ch[i]==me) {
					System.out.printf("\n%d 이미 했어요.", me);
					break;
				}
				if(dice == me){
					System.out.println("\n@딩동댕@");
					a=3;
					break;
				}
				if(dice!=me&&me<7){
					a++;
					System.out.printf("\n%d번 틀림!\n\n",a);
					break;
				}
				ch[a] = me;
			}
			
		}while(a!=3);
	
	}

}
