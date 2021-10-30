package h04.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student_table")
public class Student04 {
	
	@Id
	private int std_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	//When we use @OneToMany => it is used for parent class to indicate that this class can have many sub objects
	//But once we use @ManyToOne this means that our object can have 1 owner
	@OneToMany(mappedBy="student",orphanRemoval = true,cascade = CascadeType.ALL)
	//when we use orphanRemoval it is to indicate that we want to delete all related records to our child table
	//When we use CascadeType.ALL we are executing our approval to delete child records
	private List<Book04> bookList = new ArrayList();
	
	
	public Student04() {
		
	}
	public Student04(int std_id, String name, int grade) {
		
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
	}
	public Student04(int std_id, String name, int grade, List<Book04> bookList) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.bookList = bookList;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
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
	
	
	public List<Book04> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book04> bookList) {
		this.bookList = bookList;
	}
	@Override
	public String toString() {
		return "Student04 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", bookList=" + bookList + "]";
	}
	
	
	
	
	
	
	

}
