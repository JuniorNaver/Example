package if_switch_exam;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean primeNumber = true;
		
		System.out.print("숫자 입력: ");
		int number = input.nextInt();
		input.close();
		
		for(int i = 2; i < number; i++) { // 2부터 자기 자신이 되기 직전까지 1씩 늘려감
			if ((number % i) == 0) {	// 나누어떨어지는 순간(인수가 나오는 순간)
				primeNumber = false;	// 소수여부 false
				break;					// 이후 숫자는 확인 필요 없이 바로 빠져나옴
			}
		}
		
		System.out.printf("Is it Prime Number? %b", primeNumber);
		
	}

}
