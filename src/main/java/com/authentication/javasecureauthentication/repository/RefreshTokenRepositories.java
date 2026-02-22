package com.authentication.javasecureauthentication.repository;

import com.authentication.javasecureauthentication.modal.token.RefreshToken;
import com.authentication.javasecureauthentication.modal.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RefreshTokenRepositories extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String token);

    List<RefreshToken> findAllByUserAndRevokedFalse(User user);

    void deleteAllByUser(User user);

}
