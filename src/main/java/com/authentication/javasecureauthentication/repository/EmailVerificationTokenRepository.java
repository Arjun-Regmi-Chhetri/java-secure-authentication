package com.authentication.javasecureauthentication.repository;


import com.authentication.javasecureauthentication.modal.token.EmailVerificationToken;
import com.authentication.javasecureauthentication.modal.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface EmailVerificationTokenRepository extends JpaRepository<EmailVerificationToken, Long> {

    Optional<EmailVerificationToken> findByToken(String token);

    void deleteByUser(User user);


}
