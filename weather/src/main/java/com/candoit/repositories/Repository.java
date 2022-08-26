package com.candoit.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.candoit.DTO.CityDTO;
import com.candoit.DTO.User;
import com.candoit.DTO.WeatherDTO;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Transactional
public class Repository {

    @Autowired
    private SessionFactory sessionFactory;

    public Object save(Object objectToSave) throws Exception {
        try {
            Session session = this.sessionFactory.getCurrentSession();
            session.saveOrUpdate(objectToSave);
            session.flush();
            // session.getTransaction().commit();
            // session.close();
        } catch (Exception e) {
            throw new Exception("Exception thrown: " + e.getMessage());
        }
        return objectToSave;
    }

    public List<CityDTO> findAllCities() {
        try {
            Session session = this.sessionFactory.getCurrentSession();
            return session.createQuery("FROM CityDTO", CityDTO.class).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<WeatherDTO> findAllWeathers() {
        try {
            Session session = this.sessionFactory.getCurrentSession();
            return session.createQuery("FROM WeatherDTO", WeatherDTO.class).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<User> findAllUsers() {
        try {
            Session session = this.sessionFactory.getCurrentSession();
            return session.createQuery("FROM User", User.class).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public User findUser(Integer id) {
        try {
            Session session = this.sessionFactory.getCurrentSession();
            return session.get(User.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    public Optional<User> findUserByUsername(String username) {
        try {
            Session session = this.sessionFactory.getCurrentSession();
            return session.createQuery("FROM User WHERE username = :username", User.class)
                    .setParameter("username", username).uniqueResultOptional();
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
