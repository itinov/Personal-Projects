package Fun1;

public class Quartiles {

	public static void main(String[] args) {
		int[] list = { 130, 145, 110, 170, 125, 315, 250, 275 };
		
		System.out.println("The sorted elements are: ");
		insertionSort(list);
		print(list);
		System.out.println();
		
		System.out.println("\nThe maximum is: ");
		System.out.println(max(list));
		
		System.out.println("\nThe minimum is: ");
		System.out.println(min(list));
		
		System.out.println("\nThe range is: ");
		int max = max(list);
		int min = min(list);
		System.out.println(range(max, min));
		
		
		System.out.println("\nThe first quartile (0.25) for the data set is: ");
		System.out.println(firstQ(list, 8));
		System.out.println("\nThe second quartile/median (0.50) for the data set is: ");
		System.out.println(secondQ(list, 8));
		System.out.println("\nThe third quartile (0.75) for the data set is: ");
		System.out.println(thirdQ(list, 8));
		
		System.out.println("\nThe interquartile range (IQR) is: ");
		int Q3 = thirdQ(list, 8);
		int Q1 = firstQ(list, 8);
		System.out.println(IQR(Q3,Q1));
		
		System.out.println("\nThe mean of the data set is: ");
		mean(list, 8);
		
		System.out.println("\nThe standard deviation of the data set is: ");
		std(list, 8);

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
	
	public static int max(int[] list) {
		int max = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}
	
	public static int min(int[] list) {
		int min = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}
	
	public static int range(int max, int min) {
		int range = max - min;
		return range;
	}
	 
	public static void mean(int[] list, int n) {
		int sum = 0;
		int mean;
		for(int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		mean = sum / n;
		System.out.println(mean);
		
	}
	
	public static void std(int[] list, int n) {
		
		double sum = 0;
		double mean;
		for(int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		mean = sum / n;
		
		double var = 0;
		for(int j = 0; j < list.length; j++) {
			var += (Math.abs(Math.pow((list[j]) - mean, 2)));
		}
		double std = Math.sqrt(var/(n-1));
		System.out.printf("%4f", std);
		
	}

	public static int firstQ(int[] list, int n) {
		int temp;
		if (((n * 0.25) % 1 == 0) || ((n * 0.25) % 2 == 0) || ((n * 0.25) % 3 == 0) || ((n * 0.25) % 5 == 0)) {
			temp = (int) (n * 0.25);
			int k1 = search(list, (temp) - 1);
			int k2 = search(list, (temp + 1) - 1);
			int k = (k1 + k2) / 2;
			return k;
		} else {
			temp = (int) ((n * 0.25) + 1);
			int k = search(list, temp - 1);
			return k;
		}
	}

	public static int secondQ(int[] list, int n) {
		int temp;
		if (((n * 0.50) % 1 == 0) || ((n * 0.50) % 2 == 0) || ((n * 0.50) % 3 == 0) || ((n * 0.50) % 5 == 0)) {
			temp = (int) (n * 0.50);
			int k1 = search(list, (temp) - 1);
			int k2 = search(list, (temp + 1) - 1);
			int k = (k1 + k2) / 2;
			return k;
		} else {
			temp = (int) ((n * 0.50) + 1);
			int k = search(list, temp - 1);
			return k;
		}
	}

	public static int thirdQ(int[] list, int n) {
		int temp;
		if (((n * 0.75) % 1 == 0) || ((n * 0.75) % 2 == 0) || ((n * 0.75) % 3 == 0) || ((n * 0.75) % 5 == 0)) {
			temp = (int) (n * 0.75);
			int k1 = search(list, (temp) - 1);
			int k2 = search(list, (temp + 1) - 1);
			int k = (k1 + k2) / 2;
			return k;
		} else {
			temp = (int) ((n * 0.75) + 1);
			int k = search(list, temp - 1);
			return k;
		}
	}
	
	public static int IQR(int Q3, int Q1) {
		int IQR = Q3 - Q1;
		return IQR;
	}

	public static int search(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (i == key) {
				return list[i];
			}
		}
		return -1;
	}
}

// pseudocode:

// if(((n * 0.25) % 1 == 0) || ((n * 0.25) % 2 == 0) || ((n * 0.25) % 3 == 0) ||
// ((n * 0.25) % 5 == 0)) {
// temp = (n * 0.25);
// q1 = (temp + (temp + 1)) / 2; // here i want to the take the average of the
// (k + (k+1))/2 elements.
// System.out.println(q1);
// } else {
// q1 = (int) ((n * 0.25) + 1); // this is just the simple formula + 1, to add
// to the round up
// System.out.println(q1);
// }
//

























