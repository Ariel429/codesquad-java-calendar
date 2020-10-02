package honux.calendar;

import java.util.Scanner;
public class MaxDaysPrintEx {
	// 변하지 않는 숫자값은 상수 배열로 private 접근제한자
	private final int [] MAX_DAYS= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// 값의 리턴이 이뤄지는 부분을 메소드로 분리해냄
	public int mdaysOfMonth(int month) {
		return MAX_DAYS[month+1];
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month= scanner.nextInt();
		
		MaxDaysPrintEx mdaysPrint = new MaxDaysPrintEx();
		// 객체 생성하여 메소드와 final int[]에 접근
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, mdaysPrint.mdaysOfMonth(month));
		scanner.close();
	}

}
