package DAO;

import models.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.*;

import java.util.List;

public class UserDAO {
    public Passenger findById(int id) {
        return hibernateUtil.getSessionFactory().openSession().get(Passenger.class, id);
    }

    public void save(Passenger user) {
        Session session = hibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(Passenger user) {
        Session session = hibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(Passenger user) {
        Session session = hibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public Seat findAutoById(int id) {
        return hibernateUtil.getSessionFactory().openSession().get(Seat.class, id);
    }

    public List<Passenger> findAll() {
        List<Passenger> passengers = (List<Passenger>)  hibernateUtil.getSessionFactory().openSession().createQuery("From Passenger").list();
        return passengers;
    }
}
