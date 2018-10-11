package com.example.codeclan.coursebookingsystem.repositories.courseRepositories;

import com.example.codeclan.coursebookingsystem.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getCoursesWithCertainRating(int rating){
        List<Course> courses = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria courseCr = session.createCriteria(Course.class);
            courseCr.add(Restrictions.eq("rating", rating));
            courses = courseCr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return courses;
    }

    @Transactional
    public List<Course> getCoursesForCustomer(Long customerId){
        List<Course> courses = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.customer.id", customerId));
            courses = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return courses;
    }
}
