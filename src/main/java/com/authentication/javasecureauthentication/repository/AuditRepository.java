package com.authentication.javasecureauthentication.repository;


import com.authentication.javasecureauthentication.modal.audit.AuditLog;
import com.authentication.javasecureauthentication.modal.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditRepository extends JpaRepository<AuditLog, Long> {

    List<AuditLog> findAllByUser(User user);

    List<AuditLog> findAllByIpAddress(String ipAddress);

}
