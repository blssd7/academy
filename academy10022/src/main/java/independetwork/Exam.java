package independetwork;
/*
  Создать объект Exam, который является generic.  
Его можно параметризовать любым числом. 
Создать конструктор, который принимает массив оценок.  
Число заданий рандомное, за каждое задание ученик может получить от 0 до 10. 
Массив вы задаете сами. 
Добавить метод add, в котором вы можете добавлять оценку в массив.  
Предусмотреть добавление оценки в заполненный массив оценок. 
Добавить метод calcFinalMark, который возвращает оценку за экзамен. 
Оценка рассчитывается как среднее арифметическое.
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

