package h03.oneononejoins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import h02.embeddable.Course;

@Entity
public class Student03 {
	
	

	@Id 
	@Column(name="student_id")
	private int id;
	@Column(name="student_name")
	private String name;
	@OneToOne(mappedBy="student")
	private Dairy dairy;

	private int grade;
	
	
	
	public Student03() {
		
	}

	public Student03(int id, String name, int grade,Dairy dairy) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.dairy = dairy;
		
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	@Override
	public String toString() {
		return "Student03 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	
	
	
	
	
	
	
	

}
