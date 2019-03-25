/**
 * 
 */
package pac1;

import java.util.ArrayList;
import java.util.Random;

import org.testng.annotations.Test;

/**
 * @author bluepi
 *
 */


	/**
	 * @param args
	 */
	//Itrate List
	public class Person {
		@Test
		public void talk() {
			ArrayList a= new ArrayList<>();
			a.add("vool");
			a.add(123);
			a.add(78.98);
			a.add("TAhir");
			for (Object object : a) {
				
				System.out.println(object);
				
			}
		//	System.out.println(a);
			
		}
	}
	


