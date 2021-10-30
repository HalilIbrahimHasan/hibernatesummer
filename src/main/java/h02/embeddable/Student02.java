package h02.embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student02 {

	
	
	@Id 
	private int id;
	@Column(name="student_name")
	private String name;

	private int grade;
	private Course course;
	
	
	
	public Student02() {
		
	}

	public Student02(int id, String name, int grade,Course course) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student02 [id=" + id + ", name=" + name + ", grade=" + grade + ", course=" + course + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
