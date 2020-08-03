package non_MainRun;

public class functionRun {

	public static void main(String[] args) {
		//non static function use//
		functionClass fc = new functionClass(34);
		//functionClass obj = new functionClass(45);
		//functionClass.addNumbers(23, 52);
		//fc.printName("test");
		
		//static function use//
		//functionClass.printName("Mike");
		functionClass.addNumbers(24, 65);
	}

}
