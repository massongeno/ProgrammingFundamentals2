
package lab8;
import java.time.LocalTime;
import java.time.LocalDate;

public class Patient {
	private final String name;
	private Severity severity;
	private LocalTime arrivalTime;
        private LocalDate dob;


	public Patient(String name) {
		this.name = name;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
        
        public LocalDate getDOB() {
		return dob;
	}

        public void setDOB(LocalDate dob) {
		this.dob = dob;
	}
        
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + "\n seating=" + severity + "\n arrivalTime=" + arrivalTime;
	}
}
