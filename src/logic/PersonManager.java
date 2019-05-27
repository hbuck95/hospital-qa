package logic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import models.Person;
import models.Receptionist;

public class PersonManager {
	private static PersonManager instance = null;
	private static int staffCount = 0;
	private List<Person> staffMembers = new ArrayList<Person>();

	private PersonManager() {

	}

	public static PersonManager getInstance() {
		if (instance == null)
			instance = new PersonManager();
		return instance;
	}

	public static int getStaffCount() {
		return staffCount;
	}

	public void createTestReceptionists() {
		Calendar cal = new GregorianCalendar();
		cal.set(1987, 9, 1);

		createReceptionist(new Receptionist(staffCount, "John", "Smith", "123 Fake St.", "1987-10-15"));

	}

	public void createReceptionist(Receptionist r) {
		r.setId(staffCount);
		staffCount++;
		staffMembers.add(r);

	}

	public List<Person> getStaffMembers() {
		return staffMembers;
	}

}
