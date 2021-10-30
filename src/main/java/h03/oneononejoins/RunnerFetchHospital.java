package h03.oneononejoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetchHospital {

	
	
	public static void main(String[]args) {
		
		
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml")
											   .addAnnotatedClass(Hospital.class)
											   .addAnnotatedClass(Specialist.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx  = s.beginTransaction();
		
		tx.commit();
		
//		String sqlQuery = "SELECT h.department_id, h.name, s.specialist_id , s.grade FROM Hospital h INNER JOIN Specialist s "
//				+ "ON h.department_id = s.department_id"; 
//		
//		List<Object[]> list = s.createSQLQuery(sqlQuery).getResultList();
//		
//		for(Object[] o:list ) {
//			
//			System.out.println(Arrays.deepToString(o));
//			
//			
//		}
		
		
		String hqlQuery = "SELECT h.department_id, h.name, s.specialist_id , s.grade FROM Hospital h INNER JOIN Specialist s "
				+ "ON h.department_id = s.hospital"; 
		
		List<Object[]> list = s.createQuery(hqlQuery).getResultList();
		
		for(Object[] o:list ) {
			
			System.out.println(Arrays.deepToString(o));
			
			
		}
		
		
		
		
	}
	
	
}
