package h03.oneononejoins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerHospital {

	
	public static void main(String[] args) {
		
		
		
		Specialist spt1 = new Specialist(10, "Norology", 8);
		Specialist spt2 = new Specialist(11, "Cardiology", 9);
		Specialist spt3 = new Specialist(13, "Gastreology", 7);
		
		
		Hospital ht1 = new Hospital(101, "NorthWestern",spt1 );
		Hospital ht2 = new Hospital(102, "Hospital 2",spt2);
		Hospital ht3 = new Hospital(103, "Hospital 3",spt3 );

		spt1.setHospital(ht1);
		spt2.setHospital(ht2);

		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(Specialist.class)
				   .addAnnotatedClass(Hospital.class);

		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();

		Transaction tx  = s.beginTransaction();
		
		
		s.save(spt1);
		s.save(spt2);
		s.save(spt3);
		s.save(ht1);
		s.save(ht2);
		s.save(ht3);

		
		
		tx.commit();
	}
	
	
}
