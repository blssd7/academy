package independetwork;
/*
  ������� ������ Exam, ������� �������� generic.  
��� ����� ��������������� ����� ������. 
������� �����������, ������� ��������� ������ ������.  
����� ������� ���������, �� ������ ������� ������ ����� �������� �� 0 �� 10. 
������ �� ������� ����. 
�������� ����� add, � ������� �� ������ ��������� ������ � ������.  
������������� ���������� ������ � ����������� ������ ������. 
�������� ����� calcFinalMark, ������� ���������� ������ �� �������. 
������ �������������� ��� ������� ��������������.
 */
public class Exam<T extends Number> {
	private T[] array;

	public Exam(T[] array) {
		super();
		this.array = array;
	}	
	public void average(int[] number) {
		int marks[] = new int [10];
		while( i = 0; i< 10; i++);
			sum = sum + number [i];
		int average = sum/number.length;
		System.out.println("Average value of array element is "" + average);
		
		
	}
}

