package independetwork;

public class ExamDemo {
	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + "sum");
		}
		Exam<Integer> exam = new Exam<Integer>(array);
	}

}
