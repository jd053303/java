
public class ShellSortMain {

	public static void main(String[] args) {
		System.out.print("\n*셸 정렬을 실시합니다");
		int [] element = {30,50,7,40,88,15,44,55,22,33,77,99,11,16,1,85};
		int numbers = element.length;
		
		ShellSort.insertion(element, numbers);
		
		System.out.printf("\n\n\n 최종 정렬 결과.\n");
		for (int i = 0; i < numbers; i++) {
			System.out.printf("%d ", element[i]);
		}
	}

}
