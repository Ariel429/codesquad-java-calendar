package honux.calendar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxDaysPrint {
	public static void main(String[] args) {
		System.out.println("며칠이 있는지 알고 싶은 달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int inputMonth = scanner.nextInt();
		// 한 달이 31일인 달= 1, 3, 5, 7, 8, 10, 12
		// 한 달이 30일인 달= 4, 6, 9, 11
		ArrayList<Integer> monthsOf31Days = new ArrayList<Integer>(Arrays.asList(1,3,5,7,8,10,12));
		boolean get31months = monthsOf31Days.contains(inputMonth); 
		
		if(inputMonth == 2) {
			System.out.println("2월은 28일까지 있습니다.");
		}else if(get31months == true) {
			System.out.println(inputMonth + "월은 31일까지 있습니다.");
		}else if(get31months == false) {
			System.out.println(inputMonth + "월은 30일까지 있습니다.");
		}
	}

}
