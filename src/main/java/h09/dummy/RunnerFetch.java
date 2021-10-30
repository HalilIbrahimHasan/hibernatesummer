package h09.dummy;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

	public static void main(String[] args) {
		Book04 b1 = new Book04();
		
		Student04 std = new Student04();
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(Book04.class)
				   .addAnnotatedClass(Student04.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		std = session.get(Student04.class, 103);
		b1 = session.get(Book04.class, 13);
		
		tx.commit();

//		List<Book04> bookList = std.getBooklist();
//		
//		System.out.println("Here is the list " +bookList);
//		
//		for(Book04 b : bookList) {
//			
//			System.out.println("Each book item " +b.getBook_name());
//			
//		}
		
		
		
		System.out.println( "Here is the Student Info: "+b1.getStudent());
		
	}

}
