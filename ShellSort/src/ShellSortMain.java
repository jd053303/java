
public class ShellSortMain {

	public static void main(String[] args) {
		System.out.print("\n*�� ������ �ǽ��մϴ�");
		int [] element = {30,50,7,40,88,15,44,55,22,33,77,99,11,16,1,85};
		int numbers = element.length;
		
		ShellSort.insertion(element, numbers);
		
		System.out.printf("\n\n\n ���� ���� ���.\n");
		for (int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}
	}

}
