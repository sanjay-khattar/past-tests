/**
 * 
 */
package tests.sanjay.homework.charsearch;

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
 * Test Class for {@link CharacterSearch}.
 * 
 * @author esakhat
 *
 */
@RunWith(Parameterized.class)
public class CharacterSearchTest {

	@Rule
    public Timeout globalTimeout = new Timeout(2000); // 2 seconds max per method tested
		
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                
                 { "aaabbccxyyz", 'x' }, { "abcabcabcxxz", 'z' }  
           });
    }

    private String testStr;
    
    private Character expectedCharacter;
    
	/**
	 * 
	 */
	public CharacterSearchTest(String inputStr, Character expected) {
		this.testStr = inputStr;
		this.expectedCharacter = expected;
	}
	
	@Test
	public void testGetFirstNonRepeatedChar() {
		assumeNotNull(expectedCharacter, testStr);
		
		assertEquals(expectedCharacter, CharacterSearch.getFirstNonRepeatingChar(testStr));
	}

	@Test
	public void thisAlawaysPasses () {
		
	}
	  
}
