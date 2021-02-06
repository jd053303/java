package insertionSort;

import java.util.Scanner;

public class InsertionSortMain {
	static int numbers;
	public static void main(String[] args) {
		System.out.println("\n*몇 개의 랜덤 숫자를 가지고 삽입 정렬을 실시할까요? : ");
		Scanner scan = new Scanner(System.in);
		numbers = scan.nextInt();
		int[] element = new int[numbers];
		
		for (int i = 0; i< numbers; i++) {
			element[i] = (int) (Math.random()*100)+1;
		}
		System.out.println("\n생성된" + numbers + "개의 요소는 다음과 같습니다.");
		for (int i = 0; i< numbers; i++) {
			System.out.printf("%d ",element[i]);
		}
		
		InsertionSort.insertion(element);
		
		System.out.printf("\n\n오름차순으로 정렬했습니다.\n");
		for(int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}
		System.out.printf("\n\n내림차순으로 정렬했습니다.\n");
		for(int i = numbers-1; i >= 0; i--) {
			System.out.printf("%d ", element[i]);
		}

	}

}
