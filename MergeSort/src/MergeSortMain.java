

public class MergeSortMain {

	public static void main(String[] args) {
		System.out.println("���� ���� ���α׷�");
		int[] data = new int[]{30,50,7,40,88,15,44,55,22,33,77,99,11,66,1,85};
		int[] temp = new int[data.length];
		
		System.out.println("\n**���� ���� �� ������");
		for(int i = 0; i <= data.length-1; i++) {
			System.out.print(data[i] + " ");
		}
		
		MergeSort.merge(data, temp, 0, data.length-1);
		
		System.out.println("\n**���� ���� �� ������");
		for(int i = 0; i <= data.length-1; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
