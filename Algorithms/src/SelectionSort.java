
public class SelectionSort {
	
	private static int[] list = {5, 7, 13, 4, 1, 0, 9, 3, 5, 17};

	public static void main(String[] args) {
		selectionSort(list);
		print(list);
	}
	
	public static void selectionSort(int[] list) {
		for(int i = 0; i < list.length; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			for(int j = i + 1; j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMinIndex = j;
					currentMin = list[j];
				}
			}
				if(currentMinIndex != i) {
					list[currentMinIndex] = list[i];
					list[i] = currentMin;
				}
		}
	}
	
	public static void print(int[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}
	}

}
