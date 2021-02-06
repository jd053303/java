package QuickSort;
public class QuicksortMain {

	public static void main(String[] args) {
		System.out.print("\n*퀵 정렬을 실시합니다.");
		int data[] = {54, 34, 41, 89, 67, 16, 52, 23};
		
		QuickSort.quick(data, 0, data.length-1);
	}

}
