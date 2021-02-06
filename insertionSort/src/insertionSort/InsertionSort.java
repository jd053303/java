package insertionSort;

public class InsertionSort {
	static void insertion(int[] element) {
		int numbers = InsertionSortMain.numbers;
		for(int i = 1; i < numbers; i++) {
			int insertValue = element[i];
			int j;
			for(j = i; j > 0 && insertValue < element[j-1]; j--) {
				element[j] = element[j-1];
			}
			element[j] = insertValue;
		}
	}

}
