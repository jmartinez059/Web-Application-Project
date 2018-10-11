package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		StandardServiceRegistryBuilder ssrb =
				new StandardServiceRegistryBuilder().configure(
						"hibernate.cfg.xml");
		ssrb.applySetting("hibernate.connection.url",				
				System.getenv("wabEndPoint"));
		ssrb.applySetting("hibernate.connection.username", 
				System.getenv("wabUname"));
		ssrb.applySetting("hibernate.connection.password", 
				System.getenv("wabPword"));
		StandardServiceRegistry stanReg = ssrb.build();
		Metadata meta =
				new MetadataSources(stanReg).getMetadataBuilder().build();
		sessionFactory = meta.getSessionFactoryBuilder().build();
	}
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}

}
