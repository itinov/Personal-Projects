
// I prefer this version of bubbleSort

public class BubbleSortV2 {
	
	private static int[] list = {5, 7, 13, 4, 1, 0, 9, 3, 5, 17};

	public static void main(String[] args) {
		bubbleSort(list);
		print(list);

	}
	
	public static void bubbleSort(int[] list) {
		for(int i = list.length-1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if(list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	
	public static void print(int[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}
	}
}
