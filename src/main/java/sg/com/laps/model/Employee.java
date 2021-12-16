package sg.com.laps.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MyEmployees")
public class Employee{
	
	
	
	@ManyToOne(optional = false)
	private Manager manager;
	
	@OneToMany(cascade = CascadeType.PERSIST)
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
