package homework;

public class Test {
	public static void main(String... args) {
		boolean b = false;
		if (b == false) {
			if (b = false) {
				System.out.println("if statement");
			} else {
				System.out.println("else statement");
			}
		}
	}
}


int f;
f = 5;
f = ++f + f++;
System.out.println(f);