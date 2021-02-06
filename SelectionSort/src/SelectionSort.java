
public class SelectionSort {
	static void selection(char[] element) {
		int numbers = SelectionSortMain.numbers;
		for( int i =0; i<numbers-1; i++) {
			int selectedIndex = 1;
			for( int j = i+1; j < numbers; j++) {
				if(element[selectedIndex] > element[j]) {
					selectedIndex = j;
				}
			}
			SelectionSortSwap.swap(element, i, selectedIndex);
		}
	}
}
