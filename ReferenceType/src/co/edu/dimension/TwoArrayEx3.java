package co.edu.dimension;

public class TwoArrayEx3 {
	public static void main(String[] args) {
		//학급 1~3반, 각각의 반의 학생 수가 상이. 1반 = 3명, 2반 = 4명, 3반 = 2명
		
		int[][] scores = {{59, 63, 72}, {56, 77, 33, 24}, {55, 76}};
		
		//첫번째 반의 학생들 점수 출력
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println();
		
		//배열의 크기
		System.out.println(scores.length); //행
		System.out.println(scores[0].length); //첫번째 행의 열 크기
		System.out.println(scores[1].length); //두번째 행의 열 크기
		System.out.println(scores[2].length); //세번째 행의 열 크기
		System.out.println();
		
		// 전체 반의 합계와 평균을 담기 위한 변수 + 총 학생명수를 담기 위한 카운트 변수 선언
		double totalAvg;
		int totalSum = 0;
		int cntStudent = 0;
		
		//전체 점수 반별로 출력
		for(int i = 0; i < scores.length; i++) {
			
			//각 반의 합계와 평균을 담기 위한 변수 선언
			int sum = 0;
			double avg = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				//System.out.printf("%3d", scores[i][j]);
				cntStudent++;
			}
			
			//각 반의 합계를 전체 합계에 누적 합
			totalSum += sum;
			
			// 각 반의 평균값 
			avg = sum/(1.0 * scores[i].length);
			
			// 각 반의 합계와 평균 출력 
			System.out.println((i+1) + "반의 점수 합계는 " + sum + "점이고 평균은 " + avg + "점 입니다.");
			System.out.println();
		}
		
		//전체 점수의 합과 평균 구하기
		totalAvg = totalSum/(1.0 * cntStudent);
		System.out.println("1~3반 전체 점수의 합계는 " + totalSum + "점이고 전체 평균은 " + totalAvg + "점 입니다.");
		
	}
}
