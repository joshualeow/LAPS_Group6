package sg.com.laps.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MyManagers")
public class Manager extends Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mgrId;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private Collection<Employee> totalEmp;
	//Why persist? PERSIST just cascades for persist method.
	//If you delete or merge your parent entity, the related child entity wouln't be touched.
	
	public Manager(Manager manager, Collection<Application> applications, Integer remainingLeave) {
		super(manager, applications, remainingLeave);
		// TODO Auto-generated constructor stubCascadeType. 
	}

	public Manager(Manager manager, Collection<Employee> totalEmp) {
		this.totalEmp = totalEmp;
	}
}
