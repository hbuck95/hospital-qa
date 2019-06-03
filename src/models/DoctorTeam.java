package models;

import java.util.ArrayList;
import java.util.List;

public class DoctorTeam {
	private int id;
	private List<Doctor> doctorsOnTeam = new ArrayList<Doctor>();
	private static final int MAX_DOCTORS = 4;

	public boolean isDoctorOnTeam(Doctor d) {
		return doctorsOnTeam.contains(d);
	}

	public void addDoctor(Doctor d) {
		if (doctorsOnTeam.size() + 1 > MAX_DOCTORS) {
			System.out.println("There are already 4 doctors on this team!");
			return;
		}

		doctorsOnTeam.add(d);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the doctorsOnTeam
	 */
	public List<Doctor> getDoctorsOnTeam() {
		return doctorsOnTeam;
	}

	/**
	 * @param doctorsOnTeam
	 *            the doctorsOnTeam to set
	 */
	public void setDoctorsOnTeam(List<Doctor> doctorsOnTeam) {
		this.doctorsOnTeam = doctorsOnTeam;
	}

}
