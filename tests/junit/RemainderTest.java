package junit;

import junit.framework.TestCase;
import pass.Division;
import pass.Remainder;

public class RemainderTest extends TestCase {
	private Division division;
	private Remainder remainder;


	protected void setUp() throws Exception {
		super.setUp();
        division = new Division();
        remainder = new Remainder();

	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testRemainder() {
		this.assertEquals(remainder.remainder(0, 42), 0);
		this.assertEquals(remainder.remainder(42, 1), 0);
		this.assertEquals(remainder.remainder(127, 3), 1);
	}
}
