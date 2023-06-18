package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	

	public static Session getSession(){
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		// We need to create the SessionFactory from
	    // hibernate.cfg.xml
		SessionFactory factory = cfg.buildSessionFactory();
		
		// open the session
		Session session = factory.openSession();
		return session;
	}

	
}
