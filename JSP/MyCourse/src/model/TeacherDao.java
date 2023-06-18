package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TeacherDao {

	Session session;
	Transaction tx;
	SessionFactory factory;
	
	public TeacherDao() {
		super();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();

	}
	
	
	public void save(Teacher t)
	{
			session.save(t);
			tx.commit();
			session.close();
			factory.close();
	}
	
	
	public boolean checkUser(Teacher t)
	{
		
		Query query=session.createQuery("from Teacher where email=:e");
		query.setParameter("e",t.getEmail());
		
		List<Teacher> lt=query.list();  
		
		if(lt.isEmpty())
		{
			return false;
		}
		
		/*for(Teacher tt:lt)
		{
			if(t.getEmail().equals(tt.getEmail()))
			{
				return true;
		     }
		}
		
		return false;*/
		
		return true;
	}
	

}
