package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);


    @Modifying
    @Transactional
    @Query(value = "UPDATE user SET id = ?1, firstname = ?2, lastname = ?3, password =?4 WHERE email = ?5", nativeQuery = true)
    void findByEmail(Long Id, String firstname, String lastname, String password);


}
