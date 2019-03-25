/**
 * 
 */
package pac1;

import java.util.Stack;

import org.testng.annotations.Test;

/**
 * @author bluepi
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */// The Java String charAt() method returns the character at the specified index.
		// The index value should lie between 0 and length()-1.
	@Test
	public void eachWordReverse() {
		String str = "tahir For Geeks";
		String[] words = str.split(" ");
		String revString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			System.out.println(word);
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revString += revWord + " ";
		}
		System.out.println(revString);

	}

	@Test
	public void revStrSentances() {

		// Time Complexity: O(n)
		// we can do the this task by splitting and saving the string in reverse manner.

		String s = "i like this program very much";
		String[] words = s.split(" ");
		String revStr = "";
		for (int i = words.length - 1; i >= 0; i--) {
			revStr += words[i] + " ";

		}

		System.out.println(revStr);

	}

	@Test
	public void RevStr() {
		// The Java String charAt() method returns the character at the specified index.
		// The index value should lie between 0 and length()-1.

		String str = "i am the tester";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}

	}

	/*
	 * String s= "i am the tester"; int s1 = s.length(); for (int i = s1-1; i >=0 ;
	 * i--) { String rev= rev+s.charAt(i); System.out.println(rev);
	 */

}
