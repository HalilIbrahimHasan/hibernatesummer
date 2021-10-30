package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {
	
	
	
	
	public static void main(String[]ar) {
		
		Student01 sdt1 = new Student01(3,"Ali Can",11);
		Student01 sdt2 = new Student01(4,"Aliye Can",11);
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
		SessionFactory s1 = con.buildSessionFactory();
		Session s = s1.openSession();
		
		
		Transaction tx = s.beginTransaction();
		
		
		
		s.save(sdt1);
		
		s.save(sdt2);
		
		
		tx.commit();
		
		
		
		
		
		
		
		
	}

}
