/**
 * 
 */
package tests.sanjay.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;

/**
 * @author esakhat
 *
 */
public class ExampleTests {

	@Rule
    public Timeout globalTimeout = new Timeout(2000); // 2 seconds max per method tested
	
	@Rule
	public TestName name = new TestName();

	/**
	 * 
	 */
	public ExampleTests() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void thisAlawaysPasses () {
		
	}

	@Test
    @Ignore("Test is ignored as a demo")
    public void thisIsIgnored() {
    }
	
	@Test
	public void testA() {
		assertEquals("testA", name.getMethodName());
	}
}
