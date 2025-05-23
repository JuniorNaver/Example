package object_oriented_programming;

public class TheaterReservation {
	
	public static void main(String[] args) {
		
		// 좌석 배열 생성, 초기값 설정 : Theater 객체 생성
		
		 final int ROWS = 5;
	     final int COLS = 10;
	     Theater theater = new Theater(ROWS, COLS);
		// 좌석 번호 입력
		int row, column;
		while (true) {
			theater.showSeats();
			row = InputUtil.getInt("원하시는 행 번호를 입력하세요(종료는 -1) >> ", 1, ROWS);
			// 종료 판정
			if(row == -1) {
				System.out.println("*프로그램을 종료합니다.");
				break;
			}
			// 종료 아닐 시 행 번호 입력
			column = InputUtil.getInt("원하시는 열 번호를 입력하세요 >> ", 1, COLS);
			
			// 판정 및 변경 시작
			theater.reserveSeat(row -1, column-1);
			
		}
		
		
	}

}
