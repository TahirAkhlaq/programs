/**
 * 
 */
package pac1;

/**
 * @author bluepi
 *
 */
public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 10, 12, 3, -8, -3, 11 };

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			
		}
		System.out.println(largest);

	}

}
