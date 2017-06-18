package Objects;
import java.util.*;
public final class Factory {
	private static int workers=0;
	ArrayList<Employee> managersArr=new ArrayList<Employee>();
	CEO ceo;
	public Factory(CEO ceo){
		this.ceo=ceo;
		this.ceo.setWorkersArray(managersArr);
	}
	public final void addManager(Manager manager){
		manager.worksUnder(ceo);
		managersArr.add(manager);
		Factory.addWorker();
	}
	public static void addWorker(){
		if(workers<50)
			workers++;
		System.out.println("there are too much workers in the factory.");
	}
	public CEO getCeo() {
		return ceo;
	}
	public void setCeo(CEO ceo) {
		this.ceo = ceo;
	}
	
}
