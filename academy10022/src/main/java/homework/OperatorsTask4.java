package homework;

import java.util.Scanner;

public class OperatorsTask4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("������� �����:");
		int i = scan.nextInt();
		if (i % 2 == 0) {
			System.out.println("����� ������");
		} else if (i % 2 == 1 && i > 2) {
			System.out.println("����� �������� � ������ 2");

		} else {
			System.out.println("����� �������� � ������ 2 ");
		}
		scan.close();
	}
}