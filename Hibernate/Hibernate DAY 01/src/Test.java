import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		// We need to create the SessionFactory from
        // hibernate.cfg.xml
		SessionFactory factory = cfg.buildSessionFactory();
		
		// open the session
		Session session = factory.openSession();
		
        // Create an object of Student Class
		// Set all the details required 
        // to insert into the table
		Student s=new Student(101, "ram", "Nagpur");
	
		// For doing any CRUD operation, 
        // let us start a transaction
		Transaction tx = session.beginTransaction();
		
		// Just a save statement is enough which 
        // automatically creates an insert statement
		session.save(s);
//		session.update(s);
		
		System.out.println("Object saved successfully.....!!");
		
		// commit will help to complete
        // the changes in the table
		tx.commit();
		
		//close the session
		session.close();
		
		// Close caches and connection pools
		factory.close();

	}

}
