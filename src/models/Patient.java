package models;

public class Patient extends Person {
	private int teamAssigned;
	private int wardId;
	private TreatmentPlan treatmentPlan;

	protected Patient(int id, String firstName, String lastName, String address, String dateOfBirth) {
		super(id, firstName, lastName, address, dateOfBirth);
		treatmentPlan = new TreatmentPlan();
		treatmentPlan.setPatient(this);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the teamAssigned
	 */
	public int getTeamAssigned() {
		return teamAssigned;
	}

	/**
	 * @param teamAssigned the teamAssigned to set
	 */
	public void setTeamAssigned(int teamAssigned) {
		this.teamAssigned = teamAssigned;
	}

	/**
	 * @return the wardId
	 */
	public int getWardId() {
		return wardId;
	}

	/**
	 * @param wardId the wardId to set
	 */
	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	/**
	 * @return the treatmentPlan
	 */
	public TreatmentPlan getTreatmentPlan() {
		return treatmentPlan;
	}

	/**
	 * @param treatmentPlan the treatmentPlan to set
	 */
	public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
		this.treatmentPlan = treatmentPlan;
	}

}
