package lab1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecafDescriptionTest {
	Decaf decaf;

	@Before
	public void setUp() throws Exception {
		decaf = new Decaf();
	}

	@Test(timeout = 1000)
	public void testDecafGetDescription() {
		Assert.assertEquals("Decaf", decaf.getDescription());
	}

}
