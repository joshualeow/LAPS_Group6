package sg.com.laps.model;


public enum Leave {
	AL("Annual Leave", 1.0),
	ML("Medical Leave", 1.0),
	CL("Compensation Leave", 1.0),
	CLH("Half-Day Compensation Leave", 0.5);
	
	private Double duration;
	
	private final String displayValue;
	
	private Leave(String displayValue, Double duration){
		this.displayValue = displayValue;
		this.duration = duration;
	}
	
	public String getDisplayValue() {
		return displayValue;
	}
}
