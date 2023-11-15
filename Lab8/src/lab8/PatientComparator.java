/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Comparator;


public class PatientComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient patient1, Patient patient2) {
		int ret = patient2.getSeverity().compareTo(patient1.getSeverity());

		if (ret == 0) {
			ret = patient1.getArrivalTime().compareTo(patient2.getArrivalTime());
		}
		return ret;
	}
}
