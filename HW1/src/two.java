import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		System.out.println("2번문제");

		float n;
		Scanner input = new Scanner(System.in);//다음에 설명
		System.out.print ("첫번째 정수를 입력하시오:");		
		n = input.nextInt();//키보드에서 숫자 입력]
		
		if(n%2==0)
			System.out.println("짝수");

		else
			System.out.println("a는 홀수");
		System.out.println("==========프로그램 종료===========");
	}

}
