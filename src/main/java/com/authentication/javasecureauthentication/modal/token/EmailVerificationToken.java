package com.authentication.javasecureauthentication.modal.token;


import com.authentication.javasecureauthentication.modal.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "email_verification_tokens", indexes = {
        @Index(name = "idx_email_verification_token_token", columnList = "token"),
        @Index(name = "idx_email_verification_token_user_id", columnList = "user_id")
})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailVerificationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 512)
    private String token;


    @ManyToOne(
                fetch = FetchType.LAZY,
                optional = false
        )
        @JoinColumn(
                name = "user_id",
                nullable = false,
                foreignKey = @ForeignKey(name = "fk_email_verification_token_user")
        )
    private User user;

    @Column(nullable = false)
    private boolean used = false;

    @Column(nullable = false)
    private Instant expiryDate;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Instant createdAt;

}
