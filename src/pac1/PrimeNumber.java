/**
 * 
 */
package pac1;

/**
 * @author bluepi
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	static int fact =1;
	public static void main(String[] args) {
		int num =987;
	for (int i = 2; i < num/2; i++) {
		if (num%i==0) {
			System.out.println("not prime");
			break;
		}
		if (i==1) {
			System.out.println("prime");
			
		}
	}
	
	for(int j=1;j<num;j++) {
		fact = fact*j;
		
	}
System.out.println(fact);
	}

}
