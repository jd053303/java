import java.util.Scanner;

public class BubbleSortMain {
	static int numbers;
	public static void main(String[] args) {
		System.out.println("\n*�� ���� ���� ���ڸ� ������ ���������� �ǽ��ұ��? : ");
		Scanner scan = new Scanner(System.in);
		numbers = scan.nextInt();
		char[] element = new char[numbers];
		for (int i = 0; i< numbers; i++) {
			element[i] = (char)((int)(Math.random()*26) +65);
		}
		System.out.println("\n������"+ numbers + "���� ��Ҵ� ������ �����ϴ�.  \n\n");
		for (int i =0; i<numbers; i++) {
			System.out.printf("%c", element[i]);
		}
		BubbleSort.bubbling(element);
		
		System.out.print("\n\n *** ���Ĺ�� ����  \n * �������� ���� : �⺻�� \n * �������� ���� : 2");
		int selectOrder = scan.nextInt();
		if(selectOrder==2) {
			System.out.println("\n������������ �����߽��ϴ�.");
			for(int i = numbers-1; i>=0; i--) {
				System.out.printf("%c ",element[i]);	} 	return;		}
		else {
			System.out.println("\n������������ �����߽��ϴ�.");
			for(int i = 0; i < numbers; i++) {
				System.out.printf("%c ",element[i]);	} 	return;	}		
	}

}
