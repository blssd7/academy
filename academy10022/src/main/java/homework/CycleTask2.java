package homework;

/*
  � ������� ������ Scanner ������ ����� �����. 
���� ��� ����� �� 0 �� 10, ������� �� ������� ��������� 
�������������� ����� ������ 10�, ����� ������� ��������� 
�������������� ����� ������ 10 ��� �������������. 
���������� �������� if-else. 
 */
import java.util.Scanner;

public class CycleTask2 {
	public static void main(String[] args) {
		System.out.println("������� ����� �����");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(i);

		if (i < 10) {

			System.out.println("������������� ����� ������  10");

		} else {
			System.out.println("������������� ����� ������ 10 ��� �������������");
		}
	}
}
