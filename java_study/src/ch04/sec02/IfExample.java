package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		// if 문
		int score = 93;
		
		if(score >= 90) {    // 90 점 이상~
			System.out.println("학점은 A입니다.");
		} else if (score >= 80){    // 89 ~ 80
			System.out.println("학점은 B입니다.");
		}  else if (score >= 70){    // 79 ~ 70
			System.out.println("학점은 C입니다.");
		} else {     // 69이하
			System.out.println("학점은 D입니다.");
		}
	}

}
