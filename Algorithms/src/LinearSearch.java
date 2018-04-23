
public class LinearSearch {
	
	private static int[] list = {5, 7, 13, 4, 1, 0, 9, 3, 5, 17};
	
	public static void main(String[] args) {
		System.out.println("Index of element found at: " + linearSearch(list, 1));	
	}
	
	public static int linearSearch(int[] list, int key) {
		for(int i = 0; i < list.length; i++) {
			if(key == list[i]) {
				return i;
			}
		}
		return -1;
	}
}
