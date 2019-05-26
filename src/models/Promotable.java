package models;

public interface Promotable {

	public default void promoteDoctor(Doctor d) {
		int g = d.getGrade().ordinal();
		d.setGrade(Grade.values()[g + g == 3 ? 0 : 1]);
	}
}
