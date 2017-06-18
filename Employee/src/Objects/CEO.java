package Objects;

import java.util.ArrayList;

public class CEO extends Manager {

	public CEO(String name, int age, double wage, int id) {
		super(name, age, wage, id);
	}
	public void setWorkersArray(ArrayList<Employee> managers){
		this.workers=managers;
	}

}
