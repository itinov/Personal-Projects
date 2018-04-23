
public class SwapValues {
	
	private static int a = 1;
	private static int b = 2;

	public static void main(String[] args) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
	}

	// general method for swapping values
	public static void swapValues(int firstElement, int secondElement) {
		int temp = firstElement;
		firstElement = secondElement;
		secondElement = temp;
	}
}
