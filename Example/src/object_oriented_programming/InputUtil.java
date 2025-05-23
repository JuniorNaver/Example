package object_oriented_programming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
	private static Scanner input = new Scanner(System.in);

	public static int getInt(String prompt, int minInt, int maxInt) {
		
		int number;
		
		while (true) {
			try {
				System.out.printf("%s", prompt);
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
}
