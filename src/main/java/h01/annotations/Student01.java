package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/*
 * POJO: Plain Old Java Object
 * create private instances / variables
 * create constructors
 * create getters and setters
 * generate also toString method
 */

@Entity //when we use @Entity annotation we are telling hibernate that this should be a new table on DB
@Table(name="student")//when we use @Table annotation, we can give a new name to our table
public class Student01 {
	
	@Id //we use @id annotation to create primary key on our table
	private int id;
	@Column(name="student_name")
	private String name;
//	@Transient // it will skip this variable and it will not be generated in DB table
	private int grade;
	
	public Student01() {
		
	}

	public Student01(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
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

	@Override
	public String toString() {
		return "Student01 : id=" + id + ", name=" + name + ", grade=" + grade + ".";
	}
	
	
	
	
	
	
	
	
	
	
	

}
