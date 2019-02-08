package foo;

public class Foo {

	public String compute(int input) {
		String decInput = Integer.toString(input);
		StringBuilder output = new StringBuilder();
		if (input % 3 == 0) {
			output.append("Foo");
		}
		if (input % 5 == 0) {
			output.append("Bar");
		}
		if (input % 7 == 0) {
			output.append("Qix");
		}
		for (char ch : decInput.toCharArray()) {
			if (ch == '3') {
				output.append("Foo");
			} else if (ch == '5') {
				output.append("Bar");
			}
		}
		if (output.length() == 0) {
			output.append(decInput);
		}
		return output.toString();
	}
}
