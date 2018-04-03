import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		System.out.println("3번문제");
       int a, b, c;
       Scanner input = new Scanner(System.in);//다음에 설명
		System.out.print ("첫번째 정수를 입력하시오:");		
		a = input.nextInt();//키보드에서 숫자 입력
		System.out.print ("두번째 정수를 입력하시오:");		
		b = input.nextInt();//키보드에서 숫자 입력
		System.out.print ("세번째 정수를 입력하시오:");		
		c = input.nextInt();//키보드에서 숫자 입력
	
		if(a>b)
		{ if (a>c)
			System.out.println ("a가 가장큰수이다");
			
			else
				System.out.println ("c가 가장큰수이다.");
		
		
		}
		else {
			if(b>c)
				System.out.print ("b가 가장큰수이다");
				
				else
					System.out.print ("c가 가장큰수이다.");
		}
	}

}
