package homework;
import java.util.Scanner;
public class OperatorsTask1 {
	
	public static void main(String[] args) {
	String number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� ������ � ��������� �����:");
		Scanner inputNumber = new Scanner(System.in);
        
        
        number = inputNumber.next();
        switch (number) {

		case ("������"): 
			System.out.println("1");
			break;
		case ("�������") :
			System.out.println(" 2");
			break;
		case ("����"):
			System.out.println(" 3");
			break;
		case ("������"):
			System.out.println(" 4");
			break;
		case ("���"):
			System.out.println(" 5");
			break;
		case ("����"):
			System.out.println(" 6");
			break;
		case ("����"):
			System.out.println(" 7");	
			break;
		case ("������") :
			System.out.println(" 8");
			break;
		case ("��������"):
			System.out.println("9");
			break;
		case ("�������"):

			System.out.println("10");
			break;
		case ("������"): 
			System.out.println("11");
			
			break;
		case ("�������"):
			System.out.println("12");
			break;
			default:
				System.out.println( "��� ������ ������");
		
			
		
		}

	}

}
