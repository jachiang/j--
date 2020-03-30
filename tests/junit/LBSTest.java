package junit;

import junit.framework.TestCase;
import pass.LBS;

public class LBSTest extends TestCase {
	private LBS lbs;

	protected void setUp() throws Exception {
		super.setUp();
		lbs = new LBS();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLBS() {
		this.assertEquals(lbs.lbs(0, 42), 0);
		this.assertEquals(lbs.lbs(42, 1), 84);
		this.assertEquals(lbs.lbs(127, 3), 1016);
	}
}
