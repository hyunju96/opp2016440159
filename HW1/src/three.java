import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		System.out.println("3������");
       int a, b, c;
       Scanner input = new Scanner(System.in);//������ ����
		System.out.print ("ù��° ������ �Է��Ͻÿ�:");		
		a = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print ("�ι�° ������ �Է��Ͻÿ�:");		
		b = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print ("����° ������ �Է��Ͻÿ�:");		
		c = input.nextInt();//Ű���忡�� ���� �Է�
	
		if(a>b)
		{ if (a>c)
			System.out.println ("a�� ����ū���̴�");
			
			else
				System.out.println ("c�� ����ū���̴�.");
		
		
		}
		else {
			if(b>c)
				System.out.print ("b�� ����ū���̴�");
				
				else
					System.out.print ("c�� ����ū���̴�.");
		}
	}

}
