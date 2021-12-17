package sg.com.laps.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TheApplications")
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employeeid")
	private Integer applicationId;
	
	@NotEmpty
	@ManyToOne(optional=false)
	private Employee employee; //Leave remaining can be accessed here?
	
	private LeaveType leave;
	
	
	private ApplicationStatus status;
	
	@FutureOrPresent
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private LocalDate startDate;
	
	@FutureOrPresent
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private LocalDate endDate;
	
	private String reasons;

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Application(Integer applicationId, @NotEmpty Employee employee, @FutureOrPresent LocalDate startDate, 
			@FutureOrPresent LocalDate endDate, LeaveType leave, String reasons, ApplicationStatus status) {
		
		super();
		this.applicationId = applicationId;
		this.employee = employee;
		this.startDate = startDate;
		this.leave = leave;
		this.endDate = endDate;
		this.reasons = reasons;
		this.status = status;
	}

}
