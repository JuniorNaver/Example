package if_switch_exam;
import java.util.Scanner;
import java.util.InputMismatchException;
public class OperationEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float num1, num2, result;
		String operator;
		
		// 숫자 1 입력
		while(true) {
			try {
				System.out.print("첫번째 숫자: ");
				num1 = input.nextFloat();
				break;
			}catch(InputMismatchException e) {
				System.out.println("실수를 입력해주세요.");
				input.next();	// 버퍼 비우기
			}
		}
		
		// 연산자(operater) 입력
		
		while(true) {
			try {
				System.out.print("연산자: ");
				operator = input.next();
				break;
			}catch(InputMismatchException e) {
				System.out.println("+, -, *, / 중에서 입력해주세요.");
				input.next();	// 버퍼 비우기
			}
		}
		
		// 숫자 2 입력(나눗셈 시 검증)
		
		while(true) {
			try {
				System.out.print("두번째 숫자: ");
				num2 = input.nextFloat();
				if(operator.equals("/") && num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 0이 아닌 실수를 입력해주세요.");
					continue;
				}
				break;
			}catch(InputMismatchException e) {
				System.out.println("실수를 입력해주세요.");
				input.next();	// 버퍼 비우기
			}
		}
		// 입력 마감
		input.close();
		
		// 계산 실행
		switch(operator) {
			case "+" -> result = num1 + num2;
			case "-" -> result = num1 - num2;
			case "*" -> result = num1 * num2;
			case "/" -> result = num1 / num2;
			default -> {
				result = 0;
				System.out.println("계산 과정에서 오류가 발생했습니다.");
			}
		}
		
		
		System.out.printf("%.0f %s %.0f = %.1f", num1, operator, num2, result);
		
	}

}
