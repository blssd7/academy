package by.academy.homework.hm1;
import java.util.Scanner; 

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите тип данных:");
		String st1 = scanner.nextLine();

		switch (st1) {
		case "int":
			System.out.println("Введите число: ");
			int st2 = scanner.nextInt();
			st2 = st2 % 2;
			System.out.println("Остаток от деления на 2 = " + st2);
			break;
		case "double":
			System.out.println("Введите число: ");
			double st3 = scanner.nextDouble();
			st3 *= 0.7;
			System.out.println("70% от числа: " + st3);
			break;
		case "float":
			System.out.println("Введите число: ");
			float st4 = scanner.nextFloat();
			st4 = (float) Math.pow(st4, 2);
			System.out.println("Число в квадрате: " + st4);
			break;
		case "char":
			System.out.println("Введите символ: ");
			char st5 = scanner.next().charAt(0);
			int x = (int) st5;
			System.out.println("Код символа: " + x);
			break;
		case "String":
		case "string":
			System.out.println("Введите Ваше имя:");
			String st6 = scanner.nextLine();
			System.out.println("Привет, " + st6 + "!");
			break;
		default:
			System.out.println("Unsupported type");
		}

		scanner.close();
	}
}
