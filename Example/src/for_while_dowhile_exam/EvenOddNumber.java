package for_while_dowhile_exam;
import java.util.Scanner;
import utils.InputUtils;
public class EvenOddNumber {
// 두 수를 입력받아, 두 수 사이(포함)에 홀수의 합과 짝수의 합을 출력하는 프로그램을 작성하시오.
// 수의 크기에 상관없이 수행 가능해야 한다.
	
	
	public static void main(String[] args) {
		// 입력(양의 정수) 및 예외처리
		int num1, num2;
		Scanner input = new Scanner(System.in);
		
		num1 = InputUtils.getPositiveInt (input, "첫번째 수");
		num2 = InputUtils.getPositiveInt (input, "두번째 수");
		input.close();
		
		// 숫자 정렬, num1 < num2 가 되게끔
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// 두 수 사이값을 차례대로 판정 후 합치기
		int sumOdd = 0, sumEven = 0;
		for (int i = num1; i <= num2; i++) {
			if ((i & 1) == 1) {
				sumOdd += i;
				System.out.printf("홀수: %2d + %2d = %d%n", sumOdd-i, i, sumOdd);
			}else {
				sumEven += i;
				System.out.printf("\t\t\t짝수: %2d + %2d = %d%n", sumEven-i, i, sumEven);
			}
		}
		
		
		// 출력
		System.out.printf("홀수의 합: %d%n", sumOdd);
		System.out.printf("짝수의 합: %d%n", sumEven);
	}

}
