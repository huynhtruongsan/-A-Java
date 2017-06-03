package com.danhlamthangcanh.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() {
        try {
            // Tạo SessionFactory từ cấu hình trong file cấu hình Hibernate
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            //Có lỗi trong quá trình tạo session
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
