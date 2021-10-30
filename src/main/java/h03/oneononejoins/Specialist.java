package h03.oneononejoins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Specialist {
	
	
	/*
	 * 
	 * Have the following items in Hospital table;
	 * department_id
	 * name
	 * Specialist
	 * 
	 * Create a new table as Specialist with following items
	 * 
	 * specialist_id
	 * specialty
	 * grade
	 * 
	 * Create onoOnOne relation between these two Tables
	 * then set 3 records for them and get all common data from them
	 * 
	 * 
	 */
	@Id
	private int specialist_id;
	private String specialty;
	private int grade;
	
	@OneToOne
	@JoinColumn(name="department_id")
	private Hospital hospital;
	
	
	public Specialist() {
		
	}
	public Specialist(int specialist_id, String specialty, int grade) {
		
		this.specialist_id = specialist_id;
		this.specialty = specialty;
		this.grade = grade;
	}
	
	public Specialist(int specialist_id, String specialty, int grade,Hospital hospital) {
		
		this.specialist_id = specialist_id;
		this.specialty = specialty;
		this.grade = grade;
		this.hospital = hospital;
	}
	
	public int getSpecialist_id() {
		return specialist_id;
	}
	public void setSpecialist_id(int specialist_id) {
		this.specialist_id = specialist_id;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	@Override
	public String toString() {
		return "Specialist [specialist_id=" + specialist_id + ", specialty=" + specialty + ", grade=" + grade + "]";
	}

}
