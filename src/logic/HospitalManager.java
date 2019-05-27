package logic;

public class HospitalManager {
	private static HospitalManager instance = null;

	private HospitalManager() {

	}

	public static HospitalManager getInstance() {
		if (instance == null)
			instance = new HospitalManager();
		return instance;

	}

}
