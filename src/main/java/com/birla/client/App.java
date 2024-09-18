package com.birla.client;
import com.birla.entity.Employeey;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
public static void main(String[] args) {	

	Employeey praveen = new Employeey(3,"kumar","male",6572);
	Configuration Cfg = new Configuration().configure();
	SessionFactory sf =Cfg.buildSessionFactory();
	Session session =sf.openSession();
	Transaction tx =session.beginTransaction();
	session.save(praveen);
	tx.commit();
	
	}

}
