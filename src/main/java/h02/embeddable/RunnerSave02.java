package h02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {
	
	
	
	public static void main(String[]args) {
		
		Course course = new Course("Music","Math");
		
		Student02 std = new Student02(105, "Alper Yilmaz",11,course);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);
		SessionFactory  sf = con.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Transaction tx = s1.beginTransaction();
		
		
		s1.save(std);
		
		
		
		tx.commit();
		
		
	}
	

}
