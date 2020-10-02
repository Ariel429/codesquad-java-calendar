package honux.calendar;
import java.util.Scanner;
public class GetSum2 {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String inputnum1 = scanner.next();
		String inputnum2 = scanner.next();
		int num1 = Integer.parseInt(inputnum1);
		int num2 = Integer.parseInt(inputnum2);
		System.out.printf("두 수의 합은 %d입니다.",(num1+num2));
	}
}
