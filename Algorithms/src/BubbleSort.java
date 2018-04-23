
public class BubbleSort {
	
	private static int[] list = {5, 7, 13, 4, 1, 0, 9, 3, 5, 17};

	public static void main(String[] args) {
		bubbleSort(list, 10);
		print();

	}
	
	public static void bubbleSort(int[] list, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(list[j] > list[j+1]) {
					swap(j, j+1);
				}
			}
		}
	}
	
	public static void print() {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
	
	public static void swap(int x, int y) {
		int temp = list[x];
		list[x] = list[y];
		list[y] = temp;
	}
}
