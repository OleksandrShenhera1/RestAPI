package org.oleksandr.postgres.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.oleksandr.postgres.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Users> findAll() {
        return entityManager.createQuery("SELECT x FROM Users x", Users.class).getResultList();
    }

    @Transactional
    public void save(Users user) {
        entityManager.persist(user);
    }
}
