
import java.util.Scanner;

public class Example2_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int boxNum;					// 필요한 상자 개수(결과값)
		final int boxVol = 12;		// 상자 용량
		
		System.out.print("달걀의 개수를 입력하세요: ");
		int eggNum = input.nextInt();
		
		//boxNum = ((eggNum % boxVol) == 0) ? eggNum/boxVol : eggNum/boxVol + 1;
		boxNum = (eggNum + (boxVol - 1)) / boxVol;
		
		System.out.printf("총 %d개의 상자가 필요합니다.%n", boxNum);
		
		input.close();
	}

}
