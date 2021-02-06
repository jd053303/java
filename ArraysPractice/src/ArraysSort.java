import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysSort {

	public static void main(String[] args) {
		System.out.println("\n*몇 개의 랜덤 숫자를 가지고 삽입 정렬을 실시할까요? : ");
		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		Integer[] element = new Integer[numbers];
		
		for (int i = 0; i< numbers; i++) {
			element[i] = (int) (Math.random()*100)+1;
		}
		System.out.println("\n생성된" + numbers + "개의 요소는 다음과 같습니다.");
		for (int i = 0; i< numbers; i++) {
			System.out.printf("%d ",element[i]);
		}
		

		System.out.printf("\n\n오름차순으로 정렬\n");
		Arrays.sort(element);
		for(int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}
		System.out.printf("\n\n내림차순으로 정렬\n");
		Arrays.sort(element, Collections.reverseOrder());
		for(int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}

	}

}
