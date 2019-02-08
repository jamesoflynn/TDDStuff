package foo;

public class Foo {

	public String compute(int input) {
		String decInput = Integer.toString(input);
		StringBuilder output = new StringBuilder();
		boolean isfbq = false;
		if (input % 3 == 0) {
			output.append("Foo");
			isfbq = true;
		}
		if (input % 5 == 0) {
			output.append("Bar");
			isfbq = true;
		}
		if (input % 7 == 0) {
			output.append("Qix");
			isfbq = true;
		}
		for (char ch : decInput.toCharArray()) {
			if (ch == '3') {
				output.append("Foo");
				isfbq = true;
			} else if (ch == '5') {
				output.append("Bar");
				isfbq = true;
			} else if (ch == '7') {
				output.append("Qix");
				isfbq = true;
			} else if (ch == '0') {
				output.append("*");
			}
		}
		if (!isfbq) {
			output.setLength(0);
			for (char ch : decInput.toCharArray()) {
				output.append(ch == '0' ? '*' : ch);
			}
		}
		return output.toString();
	}
}
