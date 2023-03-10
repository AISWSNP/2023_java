package kr.ac.kopo.day04;
/*
if(조건1) {
	문장1;
} else {
	if(조건2) {
		문장2;
	} else {
		if(조건3) {
			문장3;
		} else {
			if(조건4) {
				문장4;
			} else {
				문장5;
			}
		}
	}
}
*/

/*
if(조건1) {
	문장1;
} else if(조건2) {
	문장2;
} else if(조건3) {
	문장3;
} else if(조건4) {
	문장4;
} else {
	문장5;
}
*/














import java.util.Scanner;

public class IFMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		if(book == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(book == 1) {
			System.out.println(book + " book");
		} else {
			System.out.println(book + " books");
		}
		
	}
}











