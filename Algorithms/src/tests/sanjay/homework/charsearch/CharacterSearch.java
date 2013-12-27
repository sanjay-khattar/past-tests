/**
 * 
 */
package tests.sanjay.homework.charsearch;

import java.util.HashMap;

/**
 * <pre>
 * How do you find the first non-repeated character in a string?
 *		For example:
 *			input: “aaabbccxyyz” -> out: “x”
 *			input: “abcabcabcxxz” -> out: “z”
 *</pre>
 *
 * @author esakhat
 *
 */
public class CharacterSearch {

	/**
	 * 
	 */
	public CharacterSearch() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Character getFirstNonRepeatingChar(String strInput) {
		Character firstNonRepeatingChar = null;
		
		int strLength = strInput.length();
		
		if (strLength > 0) {
			HashMap<Character, Boolean> charactersMap = new HashMap<Character, Boolean>(strLength);

			for (int i=0; i<strLength; i++) {
				char character = strInput.charAt(i);
				if (charactersMap.containsKey(character)) {
					charactersMap.put(character, Boolean.FALSE);
				}
				else {
					charactersMap.put(character, Boolean.TRUE);
				}
			}
			
			if (charactersMap.containsValue(true)) {
				for (int i=0; i<strLength; i++) {
					char character = strInput.charAt(i);
					Boolean isNonRepeating  = charactersMap.get(character);
					if (isNonRepeating) {
						firstNonRepeatingChar = character;
						break;
					}
				}				
			}
			
		}
				
		return firstNonRepeatingChar;
		
	}

}
