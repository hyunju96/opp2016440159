
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0));
		Car myCar = new Car("Space Blue", 300);
		System.out.println(myCar.numberOfCars);
		myCar.print();
//		System.out.println(yourCar.numberOfCars);//모
		//정적변수는"클라스명,정적변수명"으로도 접근할 수 있다.
//		System.out.println(Car.numberOfCars);//myCar.setColor("black");
		//myCar.setSpeed(100);
 // 	System.out.println(myCar);
	}

}
