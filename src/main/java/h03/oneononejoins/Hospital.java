package h03.oneononejoins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hospital {
	
	
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
	private int department_id;
	private String name;
	@OneToOne(mappedBy="hospital")
	private Specialist specialist;
	
	
	
	
	public Hospital() {
		
	}
	public Hospital(int department_id, String name,Specialist specialist) {
		
		this.department_id = department_id;
		this.name = name;
		this.specialist = specialist;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hospital [department_id=" + department_id + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
