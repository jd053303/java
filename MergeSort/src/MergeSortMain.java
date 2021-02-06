

public class MergeSortMain {

	public static void main(String[] args) {
		System.out.println("병합 정렬 프로그램");
		int[] data = new int[]{30,50,7,40,88,15,44,55,22,33,77,99,11,66,1,85};
		int[] temp = new int[data.length];
		
		System.out.println("\n**병합 정렬 전 데이터");
		for(int i = 0; i <= data.length-1; i++) {
			System.out.print(data[i] + " ");
		}
		
		MergeSort.merge(data, temp, 0, data.length-1);
		
		System.out.println("\n**병합 정렬 후 데이터");
		for(int i = 0; i <= data.length-1; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
