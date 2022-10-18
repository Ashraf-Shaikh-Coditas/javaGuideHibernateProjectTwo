package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                sessionFactory = configuration.configure().buildSessionFactory();
            } catch (Exception e) {

            }
        }
        return sessionFactory;

    }
}
