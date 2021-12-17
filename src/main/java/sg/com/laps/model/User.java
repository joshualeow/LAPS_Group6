package sg.com.laps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@NotEmpty
	private @Getter @Setter String firstName;
	private @Getter @Setter String secondName;
	@NotEmpty
	private @Getter @Setter String lastName;
	@NotEmpty
	private @Getter @Setter String emailAddress;
	
    public User(String firstName, String secondName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }
}
