package foo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FooTest {

	Foo foo;
	
	
	@Before
	public void setup() {
		foo = new Foo();
	}

	@Test
	public void runCompute() {
		String output = foo.compute(1);
		Assert.assertTrue("1".equals(output));
	}

}
