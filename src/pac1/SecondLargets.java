/**
 * 
 */
package pac1;

/**
 * @author bluepi
 *
 */
public class SecondLargets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 10, 12, 3, -8, -3, 11 };
		
		int larg = arr[0];
		int Slarg = arr[0];
		int Tlarg = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (larg<arr[i]) {
				
				Tlarg=Slarg;
				Slarg=larg;
				larg=arr[i];}
				else if (Slarg<arr[i]) {
					Tlarg= Slarg;
					Slarg=arr[i];	
			}
				else if (Tlarg<arr[i]) {
					Tlarg=arr[i];
				}
		}
		
		System.out.println(larg);
		System.out.println(Slarg);
		System.out.println(Tlarg);

	}

}
