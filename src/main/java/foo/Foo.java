package foo;

public class Foo {

	public String compute(int input) {
		if (input % 3 == 0) {
			return "Foo";
		}
		if (input % 5 == 0) {
			return "Bar";
		}
		return Integer.toString(input);
	}
}
