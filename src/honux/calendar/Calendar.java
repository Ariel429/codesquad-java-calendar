package honux.calendar;
import java.util.Scanner;

public class Calendar {
	
	private final int [] MAX_DAYS= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMdaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void printSampleCalendar() {
		System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		// printSampleCalendar();
		Scanner scanner= new Scanner(System.in);
		System.out.println("�ݺ��� Ƚ���� �Է��ϼ���: ");
		int iterationNum= scanner.nextInt();
		
		Calendar calendar = new Calendar();
		while(iterationNum > 0) {
			iterationNum--;
			System.out.println("���� �Է��ϼ���: ");
			int month= scanner.nextInt();
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, calendar.getMdaysOfMonth(month));
		}
		System.out.println("�ݺ��� �����մϴ�.");
		scanner.close();
	}
}

