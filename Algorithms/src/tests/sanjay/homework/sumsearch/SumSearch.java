/**
 * 
 */
package tests.sanjay.homework.sumsearch;

import java.util.HashSet;

/**
 * <pre>
 * Find if a given sum exists in an array of integers.
 *		For example:
 *			input array: [1,3,10,4,2], sum: 6 -> out: true
 *			input array: [1,3,10,4,2], sum: 21 -> out: false
 * </pre>
 * 
 * @author esakhat
 *
 */
public class SumSearch {

	/**
	 * 
	 */
	public SumSearch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean doesSumExist(int[] intArray, int sum) {
		boolean doesSumExist = false;
		
		int arrayLength = intArray.length;
		int maxAllNumSums = (int) Math.pow(2, arrayLength);
		HashSet<Integer> allSumsHashSet = new HashSet<Integer>(maxAllNumSums);
		for (int i=0; i<arrayLength; i++) {
			int currentArrayMember = intArray[i];
			int maxNewNumSums = ((int) Math.pow(2, i)) - 1;
			if (maxNewNumSums > 0) {
				HashSet<Integer> newSumsHashSet = new HashSet<Integer>(
						maxNewNumSums);
				for (int j = 0; j < i; j++) {
					int newSum = intArray[j] + currentArrayMember;
					newSumsHashSet.add(newSum);
				}
				for (int allSumsHashSetMember : allSumsHashSet) {
					int newSum = allSumsHashSetMember + currentArrayMember;
					newSumsHashSet.add(newSum);
				}
				allSumsHashSet.addAll(newSumsHashSet);
			}
			
			doesSumExist = allSumsHashSet.contains(sum);
			
			if (doesSumExist) {
				break;
			}
		}
		
		return doesSumExist;
	}
	
}
