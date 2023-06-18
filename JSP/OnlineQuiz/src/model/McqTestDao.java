package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class McqTestDao {

	Session session;
	SessionFactory factory;
	Transaction tx;
	
	public McqTestDao() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
	}
	
	public int save(McqTest m) {
		
		int status=0;
		status = (Integer)session.save(m);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		return status;
	}
	
	public int getQueCount() {
		
		Query q = session.createQuery("select count(qid) from McqTest");
		List<Long> list = q.list();
		return Math.toIntExact((Long)list.get(0));
	}
	
	public McqTest getQueById(int queId) {
		
		int count = 0;
		Query q = session.createQuery("from McqTest");
		List<McqTest> ql = q.list();
		
		for(McqTest mt:ql)
		{
			count++;
			if(count==queId)
				return mt;
		}
		return null;
	}
	
	
}
