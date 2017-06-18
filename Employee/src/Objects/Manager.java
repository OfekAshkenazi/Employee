package Objects;

import java.util.*;

public class Manager extends Employee {
	protected ArrayList<Employee> workers=new ArrayList<Employee>();
	public final int id;
	public Manager(String name, int age, double wage,int id) {
		super(name, age, wage);
		this.id=id;
		
	}
	public void addEmployee(Employee worker){
		workers.add(worker);
		Factory.addWorker();
	}
	public void workAday(){
		double workersSum=0;
		for (Iterator<Employee> iterator = workers.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			workersSum+=employee.getBaseWage();
		}
		this.wallet+=((workersSum*0.1)*this.wage);
	}
}
