package if_switch_exam;
import utils.InputUtils;
import java.util.Scanner;
public class GradesProgramming {
	
	public static void printer(String label, float score) {
		System.out.printf("%s:\t%.0f%n", label, score);
	}
	
	public static void main(String[] args) {
		float midtermExamScore, finaltermExamScore,
		reportScore, attendanceScore, totalScore = 0;
		char grade;
		String evaluation;
		
		// 중간고사, 기말고사, 레포트, 출석 점수 입력;
		Scanner input = new Scanner(System.in);
		
		midtermExamScore = InputUtils.getScore(input, "중간고사");
		finaltermExamScore = InputUtils.getScore(input, "기말고사");
		reportScore = InputUtils.getScore(input, "레포트");
		attendanceScore = InputUtils.getScore(input, "출석점수");
		
		input.close();
		InputUtils.getScore(null, null);
		
		// 점수 비중 조절
		totalScore += (midtermExamScore + finaltermExamScore) / 2
				* 0.6;
		totalScore += reportScore
				* 0.2;
		totalScore += attendanceScore
				* 0.2;
		
		// 학점 판점
		if(totalScore >= 90) {
			grade = 'A';
		}else if(totalScore >= 80){
			grade = 'B';
		}else if(totalScore >= 70){
			grade = 'C';
		}else if(totalScore >= 60){
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		// 평가 도출
		evaluation = switch(grade) {
			case 'A', 'B' -> "excellent";
			case 'C', 'D' -> "good";
			case 'F' -> "poor";
			default -> {
				System.out.println("학점이 부여되지 않았습니다.");
				yield "N/A";
			}
		};
		
		// 결과 출력
		System.out.println("-----결과입니다-----");

		// 점수 이름과 점수를 배열로 정리
		String[] labels = { "중간고사", "기말고사", "레포트", "출석점수" };
		float[] scores = { midtermExamScore, finaltermExamScore, reportScore, attendanceScore };

		// 반복 출력
		for (int i = 0; i < labels.length; i++) {
		    printer(labels[i], scores[i]);
		}
		
		System.out.println();
		System.out.printf("성적:\t%.2f%n", totalScore);
		System.out.printf("학점:\t%c%n", grade);
		System.out.printf("평가:\t%s%n", evaluation);
		
		
	}

}
