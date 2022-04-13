package co.edu.array;

import java.util.Scanner;

public class StudentProgramEx {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("==================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");
			System.out.print("선택 >>> ");

			int selectNo = scanner.nextInt();
			// int selectNo = Integer.parseInt(scanner.nextLine());
			// 숫자형 문자열을 입력받을 경우 정수로 리턴해주는 메소드

			if (selectNo == 1) {

				System.out.println("학생수 >> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				
				if(studentNum==0) {
					System.out.println("학생수를 지정하세요.");
					continue;
				}

				for (int i = 0; i < studentNum; i++) {
					System.out.println((i + 1) + "번째 학생의 점수입력 >> ");
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				
				if(studentNum==0) {
					System.out.println("학생수를 지정하세요.");
					continue;
				} else if(scores[0] == 0) {
					System.out.println("학생들의 점수를 입력하세요.");
					continue;
				}
				/* 
				 성적 오름차순으로 정렬
				 for (int i = 0; i < scores.length - 1; i++) {
					for (int j = 0; j < scores.length - 1; j++) {
						if (scores[j] > scores[j + 1]) {
							int temp = scores[j];
							scores[j] = scores[j + 1];
							scores[j + 1] = temp;
						}
					}
				} 
				*/

				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생의 점수: " + scores[i] + "점");
				}
			} else if (selectNo == 4) {
				
				if(studentNum==0) {
					System.out.println("학생수를 지정하세요.");
					continue;
				} else if(scores[0] == 0) {
					System.out.println("학생들의 점수를 입력하세요.");
					continue;
				}
				
				int maxVal, sum;
				maxVal = sum = 0; // 변수 초기화
				int minVal = scores[0];

				for (int score : scores) {
					sum += score;

					if (maxVal < score) {
						maxVal = score;
					}

					if (minVal > score) {
						minVal = score;
					}
				}

				double avg = sum / (1.0 * scores.length);

				System.out.printf("최저 점수: %d점\n최고 점수: %d점\n평균 점수: %.2f점", minVal, maxVal, avg);
				System.out.println();

			} else if (selectNo == 5) {

				run = false;
				continue;

			} else {

				System.out.println("유효한 선택값을 입력해주세요.");

			}
		}

		System.out.println("학생 성적 프로그램이 종료되었습니다.");
	}

}
