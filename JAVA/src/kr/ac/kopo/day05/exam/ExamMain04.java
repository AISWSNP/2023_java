package kr.ac.kopo.day05.exam;

/*
 	12345
 	23456
 	34567
 	45678
 	56789
 */

public class ExamMain04 {

	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) {
			
			for(int j = i; j <= i+4; j++ ){
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		/*
		 // 방법1
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.print(i+j-1);
			}
			
			System.out.println();
		}
		*/
	}
}







