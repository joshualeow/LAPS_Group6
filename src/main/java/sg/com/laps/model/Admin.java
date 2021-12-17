package sg.com.laps.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="admins")
@NoArgsConstructor	
public class Admin extends User {
   public Admin(String firstName, String secondName, String lastName, String emailAddress) {
       super(firstName, secondName, lastName, emailAddress);
    }
}
