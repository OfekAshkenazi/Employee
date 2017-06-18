package Objects;

public class Employee {
	protected String name;
	protected int age;
	protected double wage;
	protected double wallet;
	private int ManagerID;
	public Employee(String name,int age,double wage){
		this.name=name;
		this.age=age;
		this.wage=wage;
		this.wallet=0;
	}
	public void workAday(){
		this.wallet+=wage;
	}
	public void worksUnder(Manager manager){
		this.ManagerID=manager.id;
	}
	public double getBaseWage(){
		return wage;
	}
}
