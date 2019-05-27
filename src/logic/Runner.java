package logic;

import models.Person;

public class Runner {

	public static void main(String[] args) {
		HospitalManager hm = HospitalManager.getInstance();
		PersonManager pm = PersonManager.getInstance();

		pm.createTestReceptionists();
		for (Person s : pm.getStaffMembers()) {
			System.out.println(s.toString());
		}

	}

}
