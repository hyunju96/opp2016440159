
public class Point {
    //�ʵ��� scope(��ȿ����)�� Ŭ���� �����̴�.
	public double x;
	private double y;
	

	public void setX(double xx) {
		this.x = xx;
		xx=100.0;
	}
	
	public void setY(double yy) {
		this.y = yy;
		
	}
	
	
	
	public double distance() {
		//��ȯ�� ���� ����
		double result;  //���� ������ ��ȿ������ �޼ҵ� ����
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
	
	public Point move(Point p) { //�Ű����� p �� ��ȿ������ �ּҵ� ����
		
		//temp ���� ����
		double a;
		double b;
		
		//����Ʈp ��ŭ �̵�
		a = this.x + p.x;
		b = this.y + p.y;
		
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}
}



