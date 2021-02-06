
public class MergeSort {

	public static void merge(int[] data, int[] temp, int first, int last) {
		if(first < last) {
			int mid = (first + last) / 2;
			
			merge(data, temp, first, mid);
			merge(data, temp, mid+1, last);
			
			int left = first, right = mid + 1, tempIndex = left;
			
			while(left <= mid || right <= last) {
				if(right > last || (left <= mid && data[left] < data[right]))
					temp[tempIndex++] = data[left++];
				else temp[tempIndex++] = data[right++];			}
			
			System.out.println("\n\n부분 정렬 결과");
			for(int i = 0; i <= temp.length-1; i++) 
				System.out.print(temp[i] + " ");
			
			for(int i = first; i <= last; i++) 
				data[i] = temp[i];
		}
	}

}
