package models;

public interface Teamable {

	public void createDoctorTeam(int consultantId);

	public void remoteDoctorFromTeam(int teamId, Doctor d);

}
