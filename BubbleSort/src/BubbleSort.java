
public class BubbleSort {
	static void bubbling(char[]element) {
		int numbers = BubbleSortMain.numbers;
		for (int i = 0; i< numbers - 1; i++)
			for(int j = 0; j<numbers -1 -i; j++)
				if(element[j]>element[j+1])
					BubbleSortSwap.swap(element, j, j+1);
	}
}
