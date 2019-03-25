/**
 * 
 */
package pac1;

/**
 * @author bluepi
 *
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a []= {3,23,2,-54,76,232,1};
for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
			
					
				}
				
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+",");
		}

	}

}
