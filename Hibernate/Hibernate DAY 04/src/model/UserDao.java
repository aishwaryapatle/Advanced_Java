package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDao {

	public static int saveUser(User u) {
		
		int status=0;
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		status = (Integer)session.save(u);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		
		session.close();		
		return status;
	}
	
	
	public static List<User> getAllUsers() {
		
		List<User> ul = new ArrayList<User>();
		Session session = HibernateUtil.getSession();
		Query q = session.createQuery("From User");
		ul = q.list();
		session.close();
		return ul;
		
	}
	
	
	public static User getUserById(int id) {
			
		User u;
		Session session = HibernateUtil.getSession();
		Query q = session.createQuery("From User where id= :id");
		q.setParameter("id", id);
		u = (User) q.uniqueResult();
		session.close();
		return u;
			
	}
	
	
//	public static void updateUser(User u) {
//		
//		Session session = HibernateUtil.getSession();
//		Transaction tx = session.beginTransaction();
//		Query q = session.createQuery("update User set firstname= :fname, lastname= :lname, email= :email, address= :address, city= :city where id= :id");
//		q.setParameter("fname", u.getFirstname());
//		q.setParameter("lname", u.getLastname());
//		q.setParameter("email", u.getEmail());
//		q.setParameter("address", u.getAddress());
//		q.setParameter("city", u.getCity());
//		q.setParameter("id", u.getId());
//		System.out.println("Object updated successfully.....!!");
//
//		tx.commit();
//		session.close();
//	}
	
	
	public static boolean update (User user) {
		
		boolean result = true;
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			session.update(user);
			transaction.commit();
			System.out.println("Object updated successfully!");
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			result=false;
		} finally {
			session.close();
		}
		
		return result;
		
	}
	
	
	public static int deletUser(int id) {
		
		int status=0;
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("delete from User where id=:i");
		q.setParameter("i", id);
		
		status = q.executeUpdate();		
		System.out.println("Object deleted successfully.....!!");
		tx.commit();
		
		session.close();		
		return status;
	}
	
	
	
	
//	public static int save(User u) {
//		int status = 0;
//		try {
//			Connection con = getConnection();
//			PreparedStatement ps = con.prepareStatement("insert into users1 (firstname, lastname, email, address, city) values(?,?,?,?,?)");
//			ps.setString(1, u.getFirstname());
//			ps.setString(2, u.getLastname());
//			ps.setString(3, u.getEmail());
//			ps.setString(4, u.getAddress());
//			ps.setString(5, u.getCity());
//			
//			status = ps.executeUpdate();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return status;
//	}

	
	

}


