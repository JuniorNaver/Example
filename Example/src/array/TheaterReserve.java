package array;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TheaterReserve {
	static Scanner input = new Scanner(System.in);

	public static int getInt(String name, int minInt, int maxInt) {
		
		int number;
		
		while (true) {
			try {
				System.out.printf("%s", name);
				number = input.nextInt();
				if (number == -1) {
					return number;
				}
				
				if (number < minInt || number > maxInt) {
					System.out.printf("*%d~%d 사이의 번호를 입력해주세요.%n", minInt, maxInt);
				}else {
					return number;
				}
				
			} catch (InputMismatchException e) {
				System.out.printf("*%d~%d 사이의 번호를 입력해주세요.%n", minInt, maxInt);
				input.next();
			}
		}
	}
	
	public static void showSeats(char[][] seats) {
		// 첫째줄, 좌석 열 번호
		System.out.print("   ");
		for (int i = 0; i < seats[0].length; i++) {
			System.out.printf("%-2d ", i+1);
		}
		System.out.println();
		// 셋째줄 이후, 좌석 행 번호 + 좌석 현황
		for (int i = 0; i < seats.length; i++) {
			for (int j = -1; j < seats[i].length; j++) {
				if (j == -1) {
					System.out.printf("%-2d ", i+1);
				}
				else {
					System.out.printf("%-2c ", seats[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		// 좌석 배열 생성, 초기값 설정
		final int horzLength = 10, vertLength = 4; // 여기에 좌석 가로 길이, 세로 길이 입력
		final char reservedSeat = '■', unreservedSeat = '□';
		char[][] seats = new char[vertLength][horzLength]; // 가로, 세로 길이대로 좌석 배열 형성
		for (int i = 0; i < seats.length; i++) { // 빈 자리 부여
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = unreservedSeat;
			}
		}
		
		// 좌석 번호 입력
		int row, column;
		while (true) {
			showSeats(seats);
			row = getInt("원하시는 행 번호를 입력하세요(종료는 -1) >> ", 1, 10);
			// 종료 판정
			if(row == -1) {
				System.out.println("*프로그램을 종료합니다.");
				break;
			}
			// 종료 아닐 시 행 번호 입력
			column = getInt("원하시는 열 번호를 입력하세요 >> ", 1, 10);
			
			// 판정 및 변경 시작
			switch (seats[row-1][column-1]) {
				case reservedSeat -> System.out.println("*이미 예약된 자리입니다.");
				case unreservedSeat -> {
					seats[row-1][column-1] = reservedSeat;
					System.out.println("*예약되었습니다.");
				}
				default -> System.out.println("*다시 선택해주세요.");
			}
		}
		
	}

}
