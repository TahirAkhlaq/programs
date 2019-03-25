/**
 * 
 */
package pac1;

/**
 * @author bluepi
 *
 */
public class DemoWbdMgr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String names[]= {"adam","dava","adam","men", "girl","men"};
		 for (int i = 0; i < names.length; i++) {
			 for (int j = i+1; j < names.length; j++) {
				 if (names[i].equals(names[j])) {
					 
					 System.out.println("Duplicate name is"+names[i]);
					
				}
				
			}
			
		}
	}

}
