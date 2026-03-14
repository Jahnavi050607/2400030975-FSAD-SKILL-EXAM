package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo 
{
	public static void main(String[] args) 
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// INSERT RECORD USING PERSISTENT OBJECT
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		/*Restaurant r = new Restaurant();
		r.setId(1);
		r.setName("Spicy Hub");
		r.setDate("2026-03-13");
		r.setStatus("Open");
		r.setLocation("Hyderabad");

		s.save(r);

		tx.commit();
		s.close();

		System.out.println("Restaurant Record Inserted");
*/
		// UPDATE NAME AND STATUS USING HQL NAMED PARAMETERS
		s = sf.openSession();
		tx = s.beginTransaction();

		String hql = "update Restaurant set name = :name, status = :status where id = :id";

		Query query = s.createQuery(hql);
		query.setParameter("name", "Food Palace");
		query.setParameter("status", "Closed");
		query.setParameter("id", 1);

		int result = query.executeUpdate();

		System.out.println("Number of records updated: " + result);

		tx.commit();
		s.close();
		

		sf.close();
	}
}
