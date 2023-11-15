package lab8;

import java.time.LocalTime;
import java.util.Comparator;
import java.time.LocalDate;

public class EmergencyRoom 
{
    private final Heap<Patient> line;


    public EmergencyRoom(Comparator<Patient> comparator) 
    {
	line = new Heap<>(comparator);
    }

    public  void checkIn(Patient patient, LocalDate dob, Severity severity) 
    {
	patient.setArrivalTime(LocalTime.now());
        patient.setDOB(dob);
	patient.setSeverity(severity);
        line.add(patient);
    }

    public Patient admit() 
    {
        return line.remove();
    }
}
