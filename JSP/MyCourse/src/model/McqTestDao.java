package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class McqTestDao {
	Session session;
	Transaction tx;
	SessionFactory factory;
	
	public McqTestDao() {
		super();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();

	}
	
	
	public void save(McqTest t)
	{
			session.save(t);
	
	}
	
 public int qcount()
	{
		Query q=session.createQuery("select count(qid) from McqTest");  
		
		List<Long> count=q.list();
		int x=Math.toIntExact(count.get(0));
		
		return x;
	}
	
	
 public McqTest allQues(int findq)
	{
	 int count=0;
		Query q=session.createQuery("from McqTest");  //class name
	
		List<McqTest> ql=q.list();
	     for(McqTest mt:ql)
	     {
	    	 count++;
	    	 if(count==findq)
	    	 {
	    		return mt;
	    	 }
	     }
		return null;
	}
	
	
	
	
	
 public void updateMcq(McqTest mt)
	{
	    Session session = null;
	    Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		 session.update(mt);
    	session.beginTransaction().commit();

//     Query q=session.createQuery("update McqTest set que=:q where qid=:i");//, op1=:a, op2=:b, op3=:c, op4=:d, op5=:e,ans=:an ,mrk=:m  where qid=:i");  
//	 
//	 q.setParameter("q",mt.getQue());  
//	 q.setParameter("a",mt.getOp1()); 
//	 q.setParameter("b",mt.getOp2());
//	 q.setParameter("c",mt.getOp3());
//	 q.setParameter("d",mt.getOp4());
//	 q.setParameter("e",mt.getOp5());
//	 q.setParameter("an",mt.getAns());
//	 q.setParameter("m",mt.getMrk());
//     q.setParameter("i",mt.getqId());  
//
//	 int a=  q.executeUpdate();
	
	// 
	// session.saveOrUpdate(mt);
	}
	
 
	
	
	
	public McqTest getQueId(int qid)
	{
		Query q=session.createQuery("from McqTest where qId=:i");
		q.setParameter("i",qid);
		List<McqTest> list=q.list();  
		
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}
}

