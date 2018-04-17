
public class Car {
   //Fields
	private String color;
	private int speed;
	
	public static int numberOfCars = 0; //정적변수, static field
	//Constructor(생성자):매소드명ㄹ이 클라스 이름과 같다. 반환형이 없다.
	//만약생성자를 정의하지 않으면 매개변수없는 생성자를 자바에서 자동으로ㅓ 생성해준다.
	//하지만, 생성자를 하나라도 정의하면 자바는 아무일도안한다.
    public Car(String color, int  speed){
    	 this.color =color;
    	 this.speed =speed;
    	 numberOfCars++;
     }
	public Car() {
          this.color = "White";
          this.speed = 60;
          numberOfCars++;
	}
	
	
	
	//methods
	public static void print() {
		//정적메소드는 정적변수만 접근할 수 있다.
		//System.out.println(this.color + ","+ this.speed ); error
		System.out.println(numberOfCars);
	}
	public String toString() {
		return ("Color is"+this.color + "Speed is" + this.speed);
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
