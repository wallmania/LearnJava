package program.middle;

import java.util.ArrayList;
import java.util.List;

public interface LearnLambda {
	
	public static void main(String[] args) {
		
		// [1] Lambda Example 1
		// Main에서 Lambda식 정의 가능 (+, -, *, %)
		System.out.print("\n>> Lambda 식을 + 로 정의하면 "); exec((i, j) -> { return i+j; });  
		System.out.print(">> Lambda 식을 - 로 정의하면 "); exec((i, j) -> { return i-j; }); 
		System.out.print(">> Lambda 식을 * 로 정의하면 "); exec((i, j) -> { return i*j; }); 
		System.out.print(">> Lambda 식을 % 로 정의하면 "); exec((i, j) -> { return i%j; });
		System.out.println("");
		
		// [2] Lambda Example 2
		// Car 객체를 만들어서 cars에 넣습니다.
		List<Car> cars = new ArrayList<>();
		cars.add( new Car("작은차.", 2, 800, 3));
		cars.add( new Car("봉고차.", 12, 1500, 8));
		cars.add( new Car("중간차.", 5, 2200, 0));
		cars.add( new Car("비싼차.", 5, 3500, 1));
		
		// 내가 원하는 method 정의 및 사용.
		printCarCheaperThan(cars, 2000);
		// 내가 원하는 method를 함수의 input으로 넣을 수 있다. + Inner Class 사용. 
		System.out.print(">> Inner Class 사용한 경우 : "); printCarWithMyCheckCar(cars, new CheckCarForBigAndNotExpensive());
		// 내가 원하는 method를 함수의 input으로 넣을 수 있다. + Anonymous Class 사용. (인터페이스 CheckCar를 구현하는 익명클래스를 만듭니다)
		System.out.print(">> Anonymous Class 사용한 경우 : "); 
		printCarWithMyCheckCar(cars, 
			new MyCheckCar(){
				public boolean mycheck(Car car) { return car.capacity >= 4 && car.price < 2500; }
		});
		// 내가 원하는 method를 함수의 input으로 넣을 수 있다. + 인터페이스 CheckCar의 test메소드에 대응하는 람다를 만듭니다.
		System.out.print(">> Lambda 식을 사용한 경우 : ");
		printCarWithMyCheckCar(cars, 
			(Car car) -> { return car.capacity >= 4 && car.price < 2500; }
		);
		
	}
	
	// (이름은 compare인) Compare 객체 생성. 
	// Compare 객체에서 정의된 method인 .compareTo() 사용한다. 
	// 해당 method의 실제 내용은 Main에서 정의한다. --> Lambda를 사용한 것.
	public static void exec(Compare compare) {
		int k = 10; int m = 20; int value = compare.compareTo(k,m);
		System.out.println(value);
	}
	
	public static void printCarCheaperThan(List<Car> cars, int price) {
		System.out.print(">> " + price + "보다 싼 차는 ");
		for(Car car : cars) {
			if(car.price < price) { System.out.print(car + " "); }
		}
		System.out.println("");
	}
	
	interface MyCheckCar { boolean mycheck(Car car); }
	
	public static void printCarWithMyCheckCar(List<Car> cars, MyCheckCar mycheckcar) {
		for(Car car : cars) {
			if(mycheckcar.mycheck(car)) { System.out.print(car + " "); }
		}
		System.out.println("");
	}
	
	// Inner Class
	static class CheckCarForBigAndNotExpensive implements MyCheckCar {
		public boolean mycheck(Car car) { return car.capacity >= 4 && car.price < 2500; }
	}

}
