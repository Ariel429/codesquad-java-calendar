package honux.calendar;

import java.util.Scanner;
public class MaxDaysPrintEx {
	// ������ �ʴ� ���ڰ��� ��� �迭�� private ����������
	private final int [] MAX_DAYS= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// ���� ������ �̷����� �κ��� �޼ҵ�� �и��س�
	public int mdaysOfMonth(int month) {
		return MAX_DAYS[month+1];
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month= scanner.nextInt();
		
		MaxDaysPrintEx mdaysPrint = new MaxDaysPrintEx();
		// ��ü �����Ͽ� �޼ҵ�� final int[]�� ����
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, mdaysPrint.mdaysOfMonth(month));
		scanner.close();
	}

}
