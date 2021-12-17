package sg.com.laps.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;	
	@NotEmpty
	@ManyToOne(optional=false)
	private @Getter @Setter Employee employee;
	@ManyToOne(optional=false, targetEntity = LeaveType.class)
	private @Getter @Setter LeaveType leaveType;
	@OneToOne(targetEntity = ApplicationStatus.class)
	private @Getter @Setter ApplicationStatus status;
	@FutureOrPresent
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private @Getter @Setter LocalDate startDate;
	@FutureOrPresent
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private @Getter @Setter LocalDate endDate;
	private @Getter @Setter String reasons;

	public Application(@NotEmpty Employee employee, @FutureOrPresent LocalDate startDate, 
			@FutureOrPresent LocalDate endDate, String reasons, ApplicationStatus status) {
		
		super();
		this.employee = employee;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reasons = reasons;
		this.status = status;
	}

}
