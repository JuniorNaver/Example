package if_switch_exam;
import java.util.Scanner;
public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int maxNumber = input.nextInt();
		input.close();
		boolean primeNumber = true;
		
		for (int number = 2; number <= maxNumber; number++ ) { // 2부터 maxNumber까지 한 번씩 number에 할당 후 소수판단과정
			primeNumber = true; //소수가 아니라면 false로 변환
			
			for(int i = 2; i < number; i++) { // 2부터 number가 되기 직전까지 1씩 늘려감
				if ((number % i) == 0) {	// 나누어떨어지면 소수 아님 판정
					primeNumber = false;
					break;
				}		
			}
			
			if (primeNumber) {
				System.out.printf("%d ", number);
			}
		}
			
			
		
		
	}

}
