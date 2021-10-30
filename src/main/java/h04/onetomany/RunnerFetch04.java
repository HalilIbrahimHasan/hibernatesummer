package h04.onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		
		
		
		Book04 bookReader = new Book04();
		Student04 std = new Student04();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(Student04.class)
				   .addAnnotatedClass(Book04.class);


		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();

		bookReader = session.get(Book04.class, 10);
		
		std = session.get(Student04.class, 103);
		
		
		
		
		
		
		
		
		tx.commit();
		
//		System.out.println(std);
		
		//get the student name, student id, and book name from common records 
		
		String sqlQuery ="Select s.student_name, s.std_id, b.book_name "
				+ "FROM Student_table s INNER "
				+ "JOIN Book04 b "
				+ "ON s.std_id = b.std_id";
//		List <Object[]> list1 = session.createSQLQuery(sqlQuery).getResultList();
//		
////		for(Object[] o : list1) {
////			System.out.println(Arrays.toString(o));
////		}
//		for(Object[] o : list1) {
//			for(int i=0; i<o.length;i++) {
//				System.out.println(o[i]);
//			}
//		}
		
		String hqlQuery ="Select s.name, s.std_id, b.book_name "
				+ "FROM Student04 s INNER "
				+ "JOIN Book04 b "
				+ "ON s.std_id = b.student";
		
//		List<Object[]>listb = session.createQuery(hqlQuery).getResultList();
//		
//		for(Object[] o : listb) {
//			
//			System.out.println(Arrays.toString(o));
//		}
		//Please get all the records from tables printing name, book name, student id and grade
		String sqlQeury ="Select s.student_name, s.std_id, b.book_name, s.grade  "
				+ "FROM Student_table s FULL "
				+ "JOIN Book04 b "
				+ "ON s.std_id = b.std_id";
		
//		List<Object[]> listc = session.createSQLQuery(sqlQeury).getResultList();
//		
//		for(Object[] o : listc) {
//			
//			System.out.println(Arrays.toString(o));
//		}
	}

}
