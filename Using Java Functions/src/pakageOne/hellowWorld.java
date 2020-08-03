package pakageOne;

import non_MainRun.functionClass;
//eclipse importing the pakage if we call function from different pakage
public class hellowWorld {

	public static void main(String[] args) {
		functionClass obj= new functionClass(25);
       obj.printName("Bob");
	}

}
