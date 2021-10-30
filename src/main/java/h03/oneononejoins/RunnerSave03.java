package h03.oneononejoins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {

	public static void main(String[] args) {
	
		Dairy d1 = new Dairy(10, "First Dairy");
		Dairy d2 = new Dairy(11, "Second Dairy");
		Dairy d3 = new Dairy(12, "Third Dairy");
		
		
		
		Student03 std1 = new Student03(101, "Kaan Yildirim",12,d1);
		Student03 std2 = new Student03(102, "Ramazan Yesil",12,d2);
		Student03 std3 = new Student03(103, "Munine Can",12,d3);
		
		d1.setStudent(std1);
		d2.setStudent(std2);
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml")
											   .addAnnotatedClass(Student03.class)
											   .addAnnotatedClass(Dairy.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx  = s.beginTransaction();
		
		s.save(d1);
		s.save(d2);
		s.save(d3);
		s.save(std1);
		s.save(std2);
		s.save(std3);
		
		
		
		tx.commit();
		
		

	}

}
