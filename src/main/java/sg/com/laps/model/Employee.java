package sg.com.laps.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="MyEmployees")
public class Employee{
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<Application> applications;
	
	@Column(nullable=false)
	private Integer remainingLeave;
	


	public Employee(String userId, String name, String password, String employeeId, 
			Collection<Application> applications, Integer remainingLeave) {
		super();
		// TODO Auto-generated constructor stub
		this.applications = applications;
		this.remainingLeave = remainingLeave;
	}
	
}
