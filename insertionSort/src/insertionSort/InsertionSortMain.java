package insertionSort;

import java.util.Scanner;

public class InsertionSortMain {
	static int numbers;
	public static void main(String[] args) {
		System.out.println("\n*�� ���� ���� ���ڸ� ������ ���� ������ �ǽ��ұ��? : ");
		Scanner scan = new Scanner(System.in);
		numbers = scan.nextInt();
		int[] element = new int[numbers];
		
		for (int i = 0; i< numbers; i++) {
			element[i] = (int) (Math.random()*100)+1;
		}
		System.out.println("\n������" + numbers + "���� ��Ҵ� ������ �����ϴ�.");
		for (int i = 0; i< numbers; i++) {
			System.out.printf("%d ",element[i]);
		}
		
		InsertionSort.insertion(element);
		
		System.out.printf("\n\n������������ �����߽��ϴ�.\n");
		for(int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}
		System.out.printf("\n\n������������ �����߽��ϴ�.\n");
		for(int i = numbers-1; i >= 0; i--) {
			System.out.printf("%d ", element[i]);
		}

	}

}
