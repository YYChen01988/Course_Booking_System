package com.example.codeclan.coursebookingsystem.repositories.customerRepositories;

import com.example.codeclan.coursebookingsystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersOnCourse(Long courseId){
        List<Customer> customers = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseId));
            customers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return customers;
    }



    @Transactional
    public List<Customer> getCustomersFromTownOnCourse(String town, Long courseId){
        List<Customer> customers = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseId));
            cr.add(Restrictions.eq("town", town));
            customers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return customers;
    }

    @Transactional
    public List<Customer> getCustomersOverAgeFromTownOnCourse(int age, String town, Long courseId){
        List<Customer> customers = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseId));
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.gt("age", age));
            customers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return customers;
    }

}
