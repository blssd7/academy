package by.academy.homework.hm1;

public class Task4 {

	public static void main(String[] args) {

		int degree = 1;
		int x = 2;
		double y = 0;

		while (y < 1_000_000) {
			y = Math.pow(x, degree);
			System.out.println(x + " ? ??????? " + degree + " = " + y);
			degree++;
		}
	}
}
