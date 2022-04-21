package classwork;

import java.util.Scanner;

import java.util.Arrays;

public class Lesson13 {

	public static int remove_Dublicate_Elements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] tempA = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				tempA[j++] = arr[i];
			}
		}
		tempA[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = tempA[i];
		}
		return j;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите числа: 1,2,3,4,4,5");
		int[] arr = { 1, 2, 3, 4, 4, 5 };
		Arrays.sort(arr);
		int lenght = arr.length;
		lenght = remove_Dublicate_Elements(arr, lenght);
		for (int i = 0; i < lenght; i++)
			System.out.print(arr[i] + "");
	}

}
