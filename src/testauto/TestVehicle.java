package testauto;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle test = new Vehicle();
		Car obj = new Car();
		Truck obj2 = new Truck();
		MotorCycle test1 = new MotorCycle();
		test.accelarate();
		System.out.println(obj.year);
		Vehicle test3 = new Car();
		test3.test1();
		test3.accelarate();
		System.out.println(test3.year);// on using upcasting parent class variable will be called not the child class
		Vehicle.test1();
		Car.test1();

		test3.test1();
		System.out.println(Vehicle.year);
		System.out.println(Car.year);

	}

}
