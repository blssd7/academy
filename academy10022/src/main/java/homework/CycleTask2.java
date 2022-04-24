package homework;

/*
  С помощью класса Scanner ввести целое число. 
Если это число от 0 до 10, вывести на консоль сообщение 
“Положительное число меньше 10”, иначе вывести сообщение 
“Положительное число больше 10 или отрицательное”. 
Используем оператор if-else. 
 */
import java.util.Scanner;

public class CycleTask2 {
	public static void main(String[] args) {
		System.out.println("Введите любое число");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(i);

		if (i < 10) {

			System.out.println("Положительное число меньше  10");

		} else {
			System.out.println("Положительное число больше 10 или отрицательное");
		}
	}
}
