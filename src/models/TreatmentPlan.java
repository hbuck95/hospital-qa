package models;

import java.util.ArrayList;
import java.util.List;

public class TreatmentPlan {
	private int id;
	private Patient patient;
	private List<TreatmentPlanEntry> entries = new ArrayList<TreatmentPlanEntry>();

	public TreatmentPlanEntry getPlanEntry(int id) {
		return entries.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	}

	public void addPlanEntry(TreatmentPlanEntry entry) {
		entries.add(entry);
	}

	public void deletePlanEntry(TreatmentPlanEntry entry) {
		entries.remove(entry);
	}

	public void deletePlanEntry(int entryId) {
		entries.remove(getPlanEntry(entryId));
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the entries
	 */
	public List<TreatmentPlanEntry> getEntries() {
		return entries;
	}

	/**
	 * @param entries the entries to set
	 */
	public void setEntries(List<TreatmentPlanEntry> entries) {
		this.entries = entries;
	}

}
