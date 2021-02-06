import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysSort {

	public static void main(String[] args) {
		System.out.println("\n*�� ���� ���� ���ڸ� ������ ���� ������ �ǽ��ұ��? : ");
		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		Integer[] element = new Integer[numbers];
		
		for (int i = 0; i< numbers; i++) {
			element[i] = (int) (Math.random()*100)+1;
		}
		System.out.println("\n������" + numbers + "���� ��Ҵ� ������ �����ϴ�.");
		for (int i = 0; i< numbers; i++) {
			System.out.printf("%d ",element[i]);
		}
		

		System.out.printf("\n\n������������ ����\n");
		Arrays.sort(element);
		for(int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}
		System.out.printf("\n\n������������ ����\n");
		Arrays.sort(element, Collections.reverseOrder());
		for(int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}

	}

}
