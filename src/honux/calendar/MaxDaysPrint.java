package honux.calendar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxDaysPrint {
	public static void main(String[] args) {
		System.out.println("��ĥ�� �ִ��� �˰� ���� ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int inputMonth = scanner.nextInt();
		// �� ���� 31���� ��= 1, 3, 5, 7, 8, 10, 12
		// �� ���� 30���� ��= 4, 6, 9, 11
		ArrayList<Integer> monthsOf31Days = new ArrayList<Integer>(Arrays.asList(1,3,5,7,8,10,12));
		boolean get31months = monthsOf31Days.contains(inputMonth); 
		
		if(inputMonth == 2) {
			System.out.println("2���� 28�ϱ��� �ֽ��ϴ�.");
		}else if(get31months == true) {
			System.out.println(inputMonth + "���� 31�ϱ��� �ֽ��ϴ�.");
		}else if(get31months == false) {
			System.out.println(inputMonth + "���� 30�ϱ��� �ֽ��ϴ�.");
		}
	}

}
