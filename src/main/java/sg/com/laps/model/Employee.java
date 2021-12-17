package sg.com.laps.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name = "employees")
@NoArgsConstructor
@Data
public class Employee extends User {
	
	@ManyToOne(optional = true, targetEntity = Manager.class)
	private @Getter @Setter Manager manager;
	@OneToMany(targetEntity = Application.class)
	private @Getter @Setter List<Application> applications;
	private @Getter @Setter Integer remainingLeave;
	
  	public Employee(String firstName, String secondName, String lastName, String emailAddress, Manager manager, Integer remainingLeave) {
  	  super(firstName, secondName, lastName, emailAddress);
  	  this.manager = manager;
  	  this.remainingLeave = remainingLeave;
	}	
	
}
