package h03.oneononejoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {
	
	public static void main(String[]args) {
		
		
		Dairy dairy  =new Dairy();
		Student03 std = new Student03();
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(Student03.class)
				   .addAnnotatedClass(Dairy.class);

		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();

		Transaction tx  = s.beginTransaction();
		
//		dairy = s.get(Dairy.class, 11);
		
//		std = s.get(Student03.class, 103);
		
		tx.commit();
		
//		System.out.println(std);
		//Get student name, dairy, grade and id from both tables
		//Note: When we use SQL query, we need to use table column names
//		String sqlQuery = "SELECT s.student_name, d.dairy, s.grade ,s.student_id "
//				+ "FROM Student03 s INNER "
//				+ "JOIN Dairy d "
//				+ "ON s.student_id = d.student_id";
//		
//		List<Object[]> list = s.createSQLQuery(sqlQuery).getResultList();
//		
//		for(Object[] o : list) {
//			System.out.println(Arrays.toString(o));
//		}
		
		//2. way with HQL Query
		//When we work with HQL queries, we need to specify Object(Class names and variables) names rather than table column names
//		String hqlQuery = "SELECT s.name, d.dairy, s.grade ,s.id "
//				+ "FROM Student03 s INNER "
//				+ "JOIN Dairy d "
//				+ "ON s.id = d.student";
//		
//		List<Object[]> list2 = s.createQuery(hqlQuery).getResultList();
//		
//		for(Object[] o : list2) {
//			System.out.println(Arrays.toString(o));
//		}
		
		
		//Fetch all the records getting name, id, grade, dairy, we need to use sql query and HQL query
//		String sqlQuery2 = "SELECT s.student_name, s.student_id, s.grade, d.dairy FROM Student03 s FULL "
//				+ "JOIN Dairy d "
//				+ "ON s.student_id = d.student_id";
//		
//		List< Object[]> lista = s.createSQLQuery(sqlQuery2).getResultList();
//		
//		
//		for(Object[] o : lista ) {
//			
//			System.out.println(Arrays.deepToString(o));
//		}
		
		
//		
//		String hqlQuery ="SELECT s.name, s.id, s.grade, d.dairy FROM Student03 s FULL JOIN Dairy d ON s.id = d.student";
//		
//		List<Object[]> listb = s.createQuery(hqlQuery).getResultList();
//		
//		for(Object[] o : listb) {
//			
//			System.out.println(Arrays.deepToString(o));
//		}
		
		
		//Fetch All the records for Students and Dairy Table (first use SQL Then use HQL)
		//When you are trying fetch all data with SQL, you cannot use * because it will get confused
		//But you need to specify all column names
//		String sqlQueryc = "SELECT * FROM Student03 s FULL JOIN Dairy d ON s.student_id = d.student_id";
//		
//		List<Object[]> listc = s.createQuery(sqlQueryc).getResultList();
////		
//		for(Object[] o : listc) {
//			
//			System.out.println(Arrays.deepToString(o));
//		}
		
		String hqlQuery ="FROM Student03 s FULL JOIN  Dairy d ON s.id = d.student";
		
		List<Object[]> listd = s.createQuery(hqlQuery).getResultList();
////	
		for(Object[] o : listd) {
		
		System.out.println(Arrays.deepToString(o));
//	}
		}
		
	}

}
