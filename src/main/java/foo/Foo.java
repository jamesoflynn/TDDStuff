package foo;

public class Foo {

	public String compute(int input) {
		if (input % 3 == 0) {
			return "Foo";
		}
		return Integer.toString(input);
	}
}
