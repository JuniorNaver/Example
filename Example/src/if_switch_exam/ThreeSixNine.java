package if_switch_exam;
import java.util.Scanner;
public class ThreeSixNine {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int unitsDigit = 0, tensDigit = 0, clapNum = 0;
		// 입력
		System.out.print("숫자 입력(1~100): ");
		int number = input.nextInt();
		unitsDigit = number % 10;
		tensDigit = number / 10;
		input.close();
		
		// Case 1 (판정, 출력 함께) -> 가장 간단
		System.out.println("Case 1. 판정, 출력 함께");
		if ((unitsDigit % 3) == 0) {
			System.out.print("짝");
		}
		if ((tensDigit % 3) == 0) {
			System.out.print("짝");
		}
		
		
		System.out.println();
		// Case 2 (판정, 출력 분리)
		System.out.println("Case 2. 판정, 출력 분리");
		
		// 자리수 판정 version A -> 2자리 수만 가능
		if ((unitsDigit % 3) == 0) {
			clapNum++;
		}
		if ((tensDigit % 3) == 0) {
			clapNum++;
		}
		
		
		// 출력 version A -> 유지 보수에 좋음
		for (int i = 0; i < clapNum; i++) {
			System.out.print("짝");
		}
		
		
		System.out.println();
		// 출력 version B
		switch(clapNum) {
		case 2:
			System.out.print("짝");
		case 1:
			System.out.print("짝");
		}
		
		
		
		
		
		System.out.println();
		// Case 3. 판정 과정 중복 제거
		System.out.println("Case 3. 판정 과정 중복 제거");
		// 자리수 판정 version B -> 자리수 상관 없이 가능 유지 보수에 좋음
		clapNum = 0;
		int numberTemp = number;
		
		
		while(numberTemp != 0) {
			if ((numberTemp % 10) % 3 == 0) {
				clapNum++;
			}
			numberTemp /= 10; // number = number / 10 ex) 431 -> 43 -> 4
			
		}
		
		// 출력 version A -> 유지 보수에 좋음
				for (int i = 0; i < clapNum; i++) {
					System.out.print("짝");
				}
		
		
		
		

	}

}
