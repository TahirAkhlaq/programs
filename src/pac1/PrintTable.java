/**
 * 
 */
package pac1;

import org.testng.annotations.Test;

/**
 * @author bluepi
 *
 */
public class PrintTable {
	@Test
	public void multiply() {
		
		
		for (int i = 1; i <=4; i++) {
			
		int id	=i*3;
		System.out.print(id+",");
		}
		
	}

}
