package h09.dummy;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {

	
	public static void main(String[]args) {
		
		Book04 b1 = new Book04(10, "Math Book");
		Book04 b2 = new Book04(11, "Science Book");
		Book04 b3 = new Book04(12, "Java Book");
		Book04 b4 = new Book04(13, "Art Book");
		List <Book04> bl1 = new ArrayList();
		bl1.add(b1);
		bl1.add(b2);

		Student04 std1 = new Student04(101, "Ali can", 10, bl1);
		
		
		List <Book04> bl2 = new ArrayList();
		bl2.add(b2);
		bl2.add(b3);
		
		Student04 std2 = new Student04(102, "Veli Han", 10, bl2);
		
		Student04 std3 = new Student04(103, "Ayse Tan", 10);
		
		b1.setStudent(std1);
		b2.setStudent(std2);
		b3.setStudent(std3);
		b4.setStudent(std3);

		
		std3.getBooklist().add(b2);
		
		System.out.println(std3);
		

		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
											   .addAnnotatedClass(Book04.class)
											   .addAnnotatedClass(Student04.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
//		
		session.save(std1);
		session.save(std2);
		session.save(std3);

		tx.commit();
		
		
	}
}
