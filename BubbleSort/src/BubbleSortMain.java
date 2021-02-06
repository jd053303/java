import java.util.Scanner;

public class BubbleSortMain {
	static int numbers;
	public static void main(String[] args) {
		System.out.println("\n*몇 개의 랜덤 문자를 가지고 버블정렬을 실시할까요? : ");
		Scanner scan = new Scanner(System.in);
		numbers = scan.nextInt();
		char[] element = new char[numbers];
		for (int i = 0; i< numbers; i++) {
			element[i] = (char)((int)(Math.random()*26) +65);
		}
		System.out.println("\n생성된"+ numbers + "개의 요소는 다음과 같습니다.  \n\n");
		for (int i =0; i<numbers; i++) {
			System.out.printf("%c", element[i]);
		}
		BubbleSort.bubbling(element);
		
		System.out.print("\n\n *** 정렬방식 선택  \n * 오름차순 정렬 : 기본값 \n * 내림차순 정렬 : 2");
		int selectOrder = scan.nextInt();
		if(selectOrder==2) {
			System.out.println("\n내림차순으로 정렬했습니다.");
			for(int i = numbers-1; i>=0; i--) {
				System.out.printf("%c ",element[i]);	} 	return;		}
		else {
			System.out.println("\n오름차순으로 정렬했습니다.");
			for(int i = 0; i < numbers; i++) {
				System.out.printf("%c ",element[i]);	} 	return;	}		
	}

}
