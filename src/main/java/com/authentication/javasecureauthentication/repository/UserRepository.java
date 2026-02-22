package com.authentication.javasecureauthentication.repository;

import com.authentication.javasecureauthentication.modal.user.Provider;
import com.authentication.javasecureauthentication.modal.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

    Optional<User> findByEmailAndProvider(String email, Provider provider);

}
