package QuickSort;
public class QuickSort {

	public static void quick(int[] data, int first, int last) {
		System.out.printf("\n\n**first %d, last %d\n", first, last);
		QuickSortPrint.print(data);
		
		if(first >= last) return;
		
		int pivot = first, i = first + 1, j = last;
		System.out.printf("\npivot = %d \n", data[pivot]);
		
		while(i <= j) {
			while(i <= last && data[i] <= data[pivot]) i++;
			while(j > first && data[j] >= data[pivot]) j--;
			if(i > j) QuicksortSwap.swap(data, pivot, j);
			else QuicksortSwap.swap(data, i, j);
			
			System.out.println("swap result");
			QuickSortPrint.print(data);
		}
		System.out.println("pivot result");
		QuickSortPrint.print(data);
		
		quick(data, first, j-1);
		quick(data, j+1, last);
	}

}
