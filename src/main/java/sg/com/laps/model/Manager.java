package sg.com.laps.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="managers")
@Data
@NoArgsConstructor
public class Manager extends Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Integer Id;
	
	@OneToMany(targetEntity=Employee.class, cascade = CascadeType.PERSIST)
	private @Getter @Setter List<Employee> subordinates;
	
	public Manager(String firstName, String secondName, String lastName, String emailAddress, Manager manager, Integer remainingLeave) {
		super(firstName, secondName, lastName, emailAddress, manager, remainingLeave);
	}

}
