package sg.com.laps.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.FutureOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GenerationType;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class ApplicationStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@OneToOne
	private @Getter @Setter Application application;
	@FutureOrPresent
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private @Getter @Setter LocalDate dateChanged;
}
// public enum ApplicationStatus {
// 	APPROVED, REJECTED, CANCELLED, DELETED
// }
