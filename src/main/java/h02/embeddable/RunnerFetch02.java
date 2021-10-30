package h02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {
	
	
	
	public static void main(String[]args) {
		
		
		Student02 std = new Student02();
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Transaction tx = s1.beginTransaction();
		
		
		std = s1.get(Student02.class, 105);
		
		
		
		tx.commit();
		
 		
		System.out.println(std);
		
	}

}
