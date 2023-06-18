package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TeacherDao {

	Session session;
	SessionFactory factory;
	Transaction tx;
	
	public TeacherDao() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
	}
	
	public int save(Teacher t) {
		
		int status=0;
		status = (Integer)session.save(t);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		return status;
	}
	
	public boolean loginAuthentication(Teacher t) {
		
		Query q = session.createQuery("select email, password from Teacher where email=:e and password=:p");
		q.setParameter("e", t.getEmail());
		q.setParameter("p", t.getPassword());
		List<Teacher> list = q.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
}
