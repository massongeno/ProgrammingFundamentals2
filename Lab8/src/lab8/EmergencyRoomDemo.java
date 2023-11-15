/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.concurrent.TimeUnit;
import java.time.LocalDate;

/**
 *
 * @author Mason
 */
public class EmergencyRoomDemo {
    public static void main(String[] args) throws InterruptedException
	{
		EmergencyRoom eRoom = new EmergencyRoom(new PatientComparator());

		eRoom.checkIn(new Patient("Mirabella Jones"), LocalDate.of(1973, 7, 11), Severity.SEVEN); 
                TimeUnit.MILLISECONDS.sleep(10); 
                eRoom.checkIn(new Patient("Ruth Mendez"), LocalDate.of(1965, 1, 22), Severity.SEVEN); 
                TimeUnit.MILLISECONDS.sleep(10); 
                eRoom.checkIn(new Patient("Melvin Ingram"), LocalDate.of(1965, 1, 22), Severity.SEVEN); 
                TimeUnit.MILLISECONDS.sleep(10); 
                eRoom.checkIn(new Patient("Tara Silva"), LocalDate.of(1975, 5, 8), Severity.EIGHT); 
                TimeUnit.MILLISECONDS.sleep(10); 
                eRoom.checkIn(new Patient("Jeff Barnes"), LocalDate.of(1968, 12, 19), Severity.EIGHT); 


		for (Patient passenger = eRoom.admit(); passenger != null; passenger = eRoom.admit()) {
			System.out.println(passenger.toString() + " admitted\n");
		}
	}
}
