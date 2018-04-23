
public class InsertionSort {

	private static int[] list = {5, 7, 13, 4, 1, 0, 9, 3, 5, 17};
	
	public static void main(String[] args) {
		insertionSort(list);
		print(list);
	}
	
	public static void insertionSort(int[] list) {
		int key;
		for(int i = 1; i < list.length; i++) {
			key = list[i];
			int j = i - 1;
			
			while(j >= 0 && list[j] > key) {
				list[j+1] = list[j];
				j = j - 1;
			}
			list[j+1] = key;
		}
	}
	public static void print(int[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}
	}

}
