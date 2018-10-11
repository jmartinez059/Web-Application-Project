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
				"jdbc:postgresql://rev4pillars.cy8igsvx5lhu.us-east-2.rds.amazonaws.com:5432/rev4PillarsDB?");
		ssrb.applySetting("hibernate.connection.username", 
				"marti656");
		ssrb.applySetting("hibernate.connection.password", 
				"");
		StandardServiceRegistry stanReg = ssrb.build();
		Metadata meta =
				new MetadataSources(stanReg).getMetadataBuilder().build();
		sessionFactory = meta.getSessionFactoryBuilder().build();
	}
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}

}
