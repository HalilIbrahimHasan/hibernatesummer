package h04.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerDelete04 {
	
	/*
	 * Note: When we are using sql queries, we wont be able to change our data base types, that's why when we use hibernate, 
	 * we need to always go for HQL queries
	 */
	
	public static void main(String []args) {
		
		Book04 bookReader = new Book04();
		Student04 std = new Student04();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(Student04.class)
				   .addAnnotatedClass(Book04.class);


		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		String sqlQuery = "DELETE FROM Book04 ";
//		int numberOfRecordsDeleted = session.createSQLQuery(sqlQuery).executeUpdate();
		
		String sqlQueryb = "DELETE FROM Student_table ";
//		int numberOfRecordsDeleted= session.createSQLQuery(sqlQueryb).executeUpdate();
		
		
//		std = session.get(Student04.class, 102);
//		session.delete(std);
		
		std = session.get(Student04.class, 101);
		session.delete(std);
		tx.commit();
		
//		System.out.println("Number of Deleted records: "+ numberOfRecordsDeleted);
		
		//you need to delete specific records for student id 101
	}

}
