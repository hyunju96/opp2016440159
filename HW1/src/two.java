import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		System.out.println("2������");

		float n;
		Scanner input = new Scanner(System.in);//������ ����
		System.out.print ("ù��° ������ �Է��Ͻÿ�:");		
		n = input.nextInt();//Ű���忡�� ���� �Է�]
		
		if(n%2==0)
			System.out.println("¦��");

		else
			System.out.println("a�� Ȧ��");
		System.out.println("==========���α׷� ����===========");
	}

}
