package sg.com.laps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class LeaveType {
    @Id
    @Column(columnDefinition = "VARCHAR(3)")
    private @Getter @Setter String type;
    private @Getter @Setter String display;
    private @Getter @Setter Double duration;
}
// public enum LeaveType {
//     AL("Annual Leave", 1.0),
//     ML("Medical Leave", 1.0),
//     CL("Compensation Leave", 1.0),
//     CLH("Half-Day Compensation Leave", 0.5);
    
//     private Double duration;
    
//     private final String displayValue;
    
//     private LeaveType(String displayValue, Double duration){
//         this.displayValue = displayValue;
//         this.duration = duration;
//     }
    
//     public String getDisplayValue() {
//         return displayValue;
//     }
// }
