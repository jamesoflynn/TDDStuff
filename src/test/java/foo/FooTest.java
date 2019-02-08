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


	@Test // Rule 1 flag number divisible by 3.
	public void isDivisibleByThree() {
		String output = foo.compute(3);
		Assert.assertTrue(output.contains("Foo"));
	}

	@Test // Rule 2 flag number divisible by 5.
	public void isDivisibleByFive() {
		String output = foo.compute(5);
		Assert.assertTrue(output.contains("Bar"));
	}
}
