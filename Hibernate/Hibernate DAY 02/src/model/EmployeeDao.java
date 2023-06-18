package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {

	public static int insert(Employee e)
	{
		int status = 0;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		Transaction tx = session.beginTransaction();
		status = (Integer)session.save(e);
		
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		
		session.close();
		factory.close();
		
		
		return status;
	}
}
