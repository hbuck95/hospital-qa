package models;

import java.util.ArrayList;
import java.util.List;

public class Ward {
	private int id;
	private int capacity;
	private List<Patient> patientsOnWard = new ArrayList<Patient>();

	public Ward(int id, int capacity) {
		this.id = id;
		this.capacity = capacity;
	}

	public void addPatient(Patient p) {
		if (patientsOnWard.size() + 1 > capacity) {
			System.out.println("Ward is full! Patient cannot be added.");
			return;
		}

		patientsOnWard.add(p);
	}

	public int getId() {
		return id;
	}

	public int getCapacity() {
		return capacity;
	}

	public List<Patient> getPatientsOnWard() {
		return patientsOnWard;
	}

}
