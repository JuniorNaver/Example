package object_oriented_programming;

public class Theater {
	private int rows;
	private int cols; // 여기에 좌석 가로 길이, 세로 길이 입력
	private char[][] seats;
	
	private final char reservedSeat = '■';
	private final char unreservedSeat = '□';
	
	public Theater(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		seats = new char[rows][cols];
		initSeats();
	}
	
	private void initSeats() {
		for (int i = 0; i < rows; i++) { // 빈 자리 부여
			for (int j = 0; j < cols; j++) {
				seats[i][j] = unreservedSeat;
			}
		}
	}
	
	
	public void showSeats() {
		// 첫째줄, 좌석 열 번호
		System.out.print("   ");
		for (int i = 0; i < cols; i++) {
			System.out.printf("%-2d ", i+1);
		}
		System.out.println();
		// 셋째줄 이후, 좌석 행 번호 + 좌석 현황
		for (int i = 0; i < rows; i++) {
			for (int j = -1; j < cols; j++) {
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
	
	public void reserveSeat(int row, int col) {
		if (seats[row][col] == reservedSeat) {
			System.out.println("*이미 예약된 자리입니다.");
		} else {
			seats[row][col] = reservedSeat;
			System.out.println("*예약되었습니다.");
		}
		
	}
}
