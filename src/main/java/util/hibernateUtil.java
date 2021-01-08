package util;

import models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {

        Configuration cfg = new Configuration().configure();

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

        sessionFactory = cfg.buildSessionFactory(builder.build());

    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;

    }

}

//public class hibernateUtil {
//    public static SessionFactory sessionFactory;
//
//    public hibernateUtil() {
//    }
//
//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            try {
//                Configuration configuration = new Configuration().configure();
//                configuration.addAnnotatedClass(Passenger.class);
//                configuration.addAnnotatedClass(Seat.class);
//                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//                sessionFactory = configuration.buildSessionFactory(builder.build());
//            } catch (Exception e) {
//                System.out.println("exeption" + e);
//            }
//        }
//        return sessionFactory;
//    }
//}
