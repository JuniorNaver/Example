package utils;
import java.util.Scanner;
import java.util.InputMismatchException;
public class InputUtils {
		
	public static int getPositiveInt(Scanner scanner, String label) {
		int number;
		while (true) {
			try {
				System.out.printf("%s: ", label);
				number = scanner.nextInt();
					
				if(number <= 0) {
					System.out.println("양의 정수만 입력해주세요.");
					continue;
				}
					
				break;
			} catch(InputMismatchException e) {
				System.out.println("문자는 입력핧 수 없습니다. 숫자만 입력해주세요.");
				scanner.next();
			}
		}
		return number;
	}
	
	public static int getNegativeInt(Scanner scanner, String label) {
		int number;
		while(true) {
			try {
				System.out.printf("%s: ", label);
				number = scanner.nextInt();
					
				if (number >= 0) {
					System.out.println("음의 정수만 입력해주세요.");
					continue;
				}
					
				break;
			} catch(InputMismatchException e) {
				System.out.println("문자는 입력핧 수 없습니다. 숫자만 입력해주세요.");
				scanner.next();
			}
		}
		return number;
	}
	
	public static int getInt(Scanner scanner, String label) {
		int number;
		while(true) {
			try {
				System.out.printf("%s: ", label);
				number = scanner.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("문자는 입력핧 수 없습니다. 숫자만 입력해주세요.");
				scanner.next();
			}
		}
		return number;
	}
	
	public static float getScore(Scanner scanner, String label) {
		float score = 0.0f;
		
		while (true) {
			try {
				System.out.printf("%s:\t", label);
				score = scanner.nextFloat();
				if (score >= 0 && score <= 100) {
					break; // 유효한 점수이면 루프 종료
				} else {
					System.out.println("점수는 0~100 사이로 입력해주세요.");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("문자는 입력핧 수 없습니다. 숫자만 입력해주세요.");
				scanner.next(); // 잘못된 입력 제거
			}
		}
		return score;
	}
	
	public static float getFloat(Scanner scanner, String label) {
		float number = 0.0f;
		
		while (true) {
			System.out.printf("%s:\t", label);;
			try {
				number = scanner.nextFloat();
				break; // 유효한 점수이면 루프 종료
			} catch (InputMismatchException e) {
				System.out.println("문자는 입력핧 수 없습니다. 숫자만 입력해주세요.");
				scanner.next(); // 잘못된 입력 제거
			}
		}
		return number;
	}
	
	public static float getPositiveFloat(Scanner scanner, String label) {
		float number = 0.0f;
		
		while (true) {
			try {
				System.out.printf("%s:\t", label);
				number = scanner.nextFloat();
				if (number <= 0) {
					System.out.println("양수만 입력해주세요.");
					continue;
				}
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("문자는 입력핧 수 없습니다. 숫자만 입력해주세요.");
				scanner.next(); // 잘못된 입력 제거
			}
		}
		return number;
	}
	
	public static float getNegativeFloat(Scanner scanner, String label) {
		float number = 0.0f;
		
		while (true) {
			try {
				System.out.printf("%s:\t", label);
				number = scanner.nextFloat();
				if (number >= 0) {
					System.out.println("양수만 입력해주세요.");
					continue;
				}
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("문자는 입력핧 수 없습니다. 숫자만 입력해주세요.");
				scanner.next(); // 잘못된 입력 제거
			}
		}
		return number;
	}
	
}
