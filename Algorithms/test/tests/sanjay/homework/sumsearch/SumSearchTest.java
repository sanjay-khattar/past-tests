/**
 * 
 */
package tests.sanjay.homework.sumsearch;

import static org.junit.Assert.*;
import static org.junit.Assume.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test Class for {@link SumSearch}.
 * 
 * @author esakhat
 *
 */
@RunWith(Parameterized.class)
public class SumSearchTest {

	@Rule
    public Timeout globalTimeout = new Timeout(2000); // 2 seconds max per method tested

	private static final int[] testInputArray1 = {1,3,10,4,2};
		
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                
                 { testInputArray1, 6, true }, { testInputArray1, 21, false },
                 { testInputArray1, 8, true }, { testInputArray1, 20, true },
                 { testInputArray1, 2, false }, { testInputArray1, 100, false }
           });
    }

    private int[] inputArray;
    
    private int sum;
    
    private boolean expectedDoesSumExist;
    
	/**
	 * 
	 */
	public SumSearchTest(int[] testInputArray, int testSum, boolean testDoesSumExist) {
		this.inputArray = testInputArray;
		this.sum = testSum;
		this.expectedDoesSumExist = testDoesSumExist;
	}
	
	@Test
	public void testDoesSumExist() {
		assumeNotNull(inputArray);
		assumeTrue(inputArray.length > 0);
		
		boolean actualDoesSumExist = SumSearch.doesSumExist(inputArray, sum);
		assertEquals(
				"Finding sum: " + sum + " in inputArray: "
						+ Arrays.toString(inputArray), expectedDoesSumExist,
				actualDoesSumExist);
	}

}
