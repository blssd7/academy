package by.academy.homework.hm1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double discount = 0;

		System.out.println("����� ����� �������:");
		double price = scanner.nextDouble();

		System.out.println("������� ��� �������:");
		int age = scanner.nextInt();

		if (price < 100) {
			discount = 5;

		} else if (price < 200 && price >= 100) {
			discount = 7;
		} else if (price >= 200 && price < 300) {
			discount = 12;
			if (age >= 18) {
				discount += 4;

			} else {
				discount -= 3;
			}
		} else if (price > 300 && price < 400) {
			discount = 15;

		} else if (price >= 400) {
			discount = 20;
		}
		System.out.println("������: +  discount + %");

		discount = price * (discount / 100);
		price -= discount;

		System.out.println("���� �� �������: $" + price);

		scanner.close();
	}
}
