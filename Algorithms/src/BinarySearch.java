
public class BinarySearch {
	
	private static int[] list = {5, 7, 13, 4, 1, 0, 9, 3, 5, 17};
	
	public static void main(String[] args) {
		System.out.println("Index of element found at: " + binarySearch(list, 1));
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length-1;
		while(low <= high) {
			int mid = (high + low) / 2;
			if(key == list[mid]) {
				return mid;
			} else if(key < list[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -low - 1;
	}
}
