
public class g20180320 {

	public static void main(String[] args) {
	   //1~10������ ȭ�鿡 ���
	   int i;//i�� ��������
	   i = 1;//�������� �ʱ�ȭ
	   while (i<=10) { //2.���� ���ǽ�
           System.out.println(i);//3.������
           i++;//4. �������� ��ȭ
        }
	   int sum = 0;
	   i = 2;//1.�������� �ʱ�ȭ
	   while (i<=10 ) { //2.���� ���ǽ�
		   sum = sum + i;//���� ��
		   i++;//4.�������� ��ȭ
	   }
	   for (i=1; i<=10; i++) {
		   System.out.println(i);
	   }
	   System.out.println("Sum =" + sum);
	   //���忡�� 1�� ���� ���ϱ�
	   String str = "hello darkness my old friend";
	   int count =0;
	   for (i =0; i < str.length(); i++) {
		   if(str.charAt(i) !='l')
			   continue;
		   count++;
	   }
	   System.out.println("���忡�� �߰��� 1�� ����"+ count);
	  
	   
	   
	   System.out.println("==============���α׷� ����==============");
	}
}
