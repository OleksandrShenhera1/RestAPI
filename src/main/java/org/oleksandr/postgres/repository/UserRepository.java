package org.oleksandr.postgres.repository;

import org.oleksandr.postgres.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findAll();

    <S extends Users> S save(S user);
    // S - це типу клас Users або його підклас //
}