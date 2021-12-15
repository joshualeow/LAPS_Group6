package sg.com.laps.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Employee extends User{
	
	@ManyToOne(optional = false)
	private Manager manager;
	
	private Collection<Application> applications;
	
	private Integer remainingLeave;
	
	public Employee() {
		
	}

	public Employee(Manager manager, Collection<Application> applications, Integer remainingLeave) {
		super();
		// TODO Auto-generated constructor stub
		this.manager = manager;
		this.applications = applications;
		this.remainingLeave = remainingLeave;
	}
	
	
	
}
