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

	@Test // Rule 3 flag number divisible by 7.
	public void isDivisibleBySeven() {
		String output = foo.compute(7);
		Assert.assertTrue(output.contains("Qix"));
	}
	
	// Rule 4. for each each digit 3, 5, 7 add "Foo", "Bar", "Qix" in the digit order.

	
	//	Rule 4.1 for each digit 3 add "Foo" in the Digits order.
	
	@Test // Rule 4.1.1 if number contains "3" then add "Foo", with Rule 1!
	public void doesNumberContainThree() {
		String output = foo.compute(3);
		Assert.assertTrue(output.equals("FooFoo"));
		output = foo.compute(33);
		Assert.assertTrue(output.equals("FooFooFoo"));
		output = foo.compute(13);
		Assert.assertTrue(output.equals("Foo"));
	}
	
	// Rule 4.2 for each digit 5 add "Bar" in the digits order.
	@Test // Rule 4.2.1, if number contains "5" then add "Bar, with Rule 2!
	public void doesNumberContainFive() {
		String output = foo.compute(5);
		Assert.assertTrue(output.equals("BarBar"));
		output = foo.compute(55);
		Assert.assertTrue(output.equals("BarBarBar"));
	}
	
	// Rule 4.3 for each digit 7 add "Qix" in the digits order
	
	@Test // Rule 4.3.1, in number contains "7" then add "Qix", with Rules 3!
	public void doesNumberContainSeven() {
		String output = foo.compute(7);
		Assert.assertTrue(output.equals("QixQix"));
		output = foo.compute(77);
		Assert.assertTrue(output.equals("QixQixQix"));
	}

	// Rule 5 (Step 2) We must replace "0" with "*"

	@Test // Rue 5 0 is replaced with *;
	public void areZerosReplacedWithStars() {
		String output = foo.compute(0);
		Assert.assertTrue("*".equals(output));
	}
}
