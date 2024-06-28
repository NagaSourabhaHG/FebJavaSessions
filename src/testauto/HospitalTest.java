package testauto;

public class HospitalTest {

	/*
	 * If there are methods available in the parent class and not in child class on
	 * calling parent class method will be called
	 * 
	 * if there are any overiden methods ,overiden methods will be called and not
	 * the parent class one if there are new methods implemented those will be
	 * called accordingly
	 * 
	 * On upcasting if there is any methods applicable for parent class those will 
	 * be executed ,you cannot access child own methods and also if any methods are overiden 
	 * overiden method will be executed 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital test = new Hospital();
		Apollo obj = new Apollo();
		Fortis obj1 = new Fortis();
		Max obj2 = new Max();
		
		test.admitPatient();
		// Using Parent class object you can only access parent class methods
		obj.dischargePatient();// Overiden method wil be executed

		obj.performSurgery();// this is new method of the new class

		obj1.admitPatient();
		obj1.prescribeMedication();
		obj2.conductTest();
		obj2.admitPatient();
		obj2.dischargePatient();
		
		Hospital obj3 = new Apollo();
		obj3.admitPatient();
		obj3.treatPatient();


	}

}
