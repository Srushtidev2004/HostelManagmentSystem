package com.sit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentDao {
     public static void main(String[] args) {
        System.out.println(1);
		Configuration cfg=new Configuration();//
		System.out.println(2);
		cfg.configure(); //it is trying to locate hibernate.cfg.xml
		System.out.println(3);
		cfg.addAnnotatedClass (Hostel.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		System.out.println(4);
	
		Session session=sessionFactory.openSession();
		System.out.println(5);
		Hostel student=new Hostel(2,"srushti",21,"bca");
		System.out.println(student);
		session.save(student);
		session.beginTransaction().commit();
		
		
	}

}
