package honux.calendar;
import java.util.Scanner;
public class GetSum {
	public static void main(String[] args) {
		System.out.println("�� ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String [] splitValue = inputValue.split(" ");
		int first = Integer.parseInt(splitValue[0]);
		int second = Integer.parseInt(splitValue[1]);
		System.out.println("�� ���� ���� "+ (first+second) +" �Դϴ�.");
	}
}
