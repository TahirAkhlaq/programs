/**
 * 
 */
package pac1;

import org.testng.annotations.Test;

/**
 * @author bluepi
 *
 */
public class Pattern {

	/**
	 * @param args
	 */
//	@Test
	public void piramind() {
		for (int i = 1; i<= 5; i++) {
			for(int j= 5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<i;k++) {
				System.out.print("*");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void numPattern() {
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	/*  1											1
		22    Change the value i to j in print 		12
		333			o/p will be====>				123
		4444										1234 */
	}



public void numPatternIncrease() {
	int count =0;
	for(int i=0;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			count =count+1;
			System.out.print(count);
		}
		System.out.println();
	/*  1
		23
		456
		78910*/
	}
}

}