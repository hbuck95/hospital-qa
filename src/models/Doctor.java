package models;

public class Doctor extends Person {
	private Grade grade;
	private int teamId = 0;

	public Doctor(int id, String firstName, String lastName, String address, String dateOfBirth, Grade grade) {
		super(id, firstName, lastName, address, dateOfBirth);
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}

	public void recordPatientTreatment() {
		// TODO
	}

	/**
	 * @return the grade
	 */
	public Grade getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	/**
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

}
