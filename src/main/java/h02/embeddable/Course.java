package h02.embeddable;

import javax.persistence.Embeddable;

@Embeddable //this helps us to create new column names into another object
public class Course {
	
	
	private String selective;
	private String mandatory;
	public Course() {
		
	}
	public Course(String selective, String mandatory) {
		super();
		this.selective = selective;
		this.mandatory = mandatory;
	}
	public String getSelective() {
		return selective;
	}
	public void setSelective(String selective) {
		this.selective = selective;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	@Override
	public String toString() {
		return "Course [selective=" + selective + ", mandatory=" + mandatory + "]";
	}
	
	
	

}
