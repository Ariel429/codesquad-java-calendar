package honux.calendar;
import java.util.Scanner;
public class GetSum2 {
	public static void main(String[] args) {
		System.out.println("�� ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		String inputnum1 = scanner.next();
		String inputnum2 = scanner.next();
		int num1 = Integer.parseInt(inputnum1);
		int num2 = Integer.parseInt(inputnum2);
		System.out.printf("�� ���� ���� %d�Դϴ�.",(num1+num2));
	}
}
