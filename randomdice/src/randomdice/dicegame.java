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
					System.out.println("�ֻ����� 1~6������ �־��\n");
					break;
				}
				if(ch[i]==me) {
					System.out.printf("\n%d �̹� �߾��.", me);
					break;
				}
				if(dice == me){
					System.out.println("\n@������@");
					a=3;
					break;
				}
				if(dice!=me&&me<7){
					a++;
					System.out.printf("\n%d�� Ʋ��!\n\n",a);
					break;
				}
				ch[a] = me;
			}
			
		}while(a!=3);
	
	}

}
