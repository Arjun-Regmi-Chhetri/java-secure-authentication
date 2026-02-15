## Stay tuned, currently under construction.

```
auth-service/
│
├── src/main/java/com/yourname/auth/
│
│   ├── AuthApplication.java
│
│   ├── config/                     # Global configurations
│   │   ├── SecurityConfig.java
│   │   ├── JwtConfig.java
│   │   ├── RedisConfig.java
│   │   ├── MailConfig.java
│   │   └── Bucket4jConfig.java
│   │
│   ├── domain/                     # Pure domain models
│   │   ├── user/
│   │   │   ├── User.java
│   │   │   ├── Role.java
│   │   │   ├── Provider.java
│   │   │   └── UserStatus.java
│   │   │
│   │   ├── token/
│   │   │   ├── RefreshToken.java
│   │   │   ├── EmailVerificationToken.java
│   │   │   └── PasswordResetToken.java
│   │   │
│   │   └── audit/
│   │       └── AuditLog.java
│   │
│   ├── repository/                 # JPA repositories
│   │   ├── UserRepository.java
│   │   ├── RefreshTokenRepository.java
│   │   ├── AuditRepository.java
│   │   └── TokenRepositories...
│   │
│   ├── security/                   # Security layer
│   │   ├── jwt/
│   │   │   ├── JwtService.java
│   │   │   ├── JwtAuthenticationFilter.java
│   │   │   └── JwtTokenProvider.java
│   │   │
│   │   ├── oauth/
│   │   │   ├── CustomOAuth2UserService.java
│   │   │   ├── OAuth2SuccessHandler.java
│   │   │   └── OAuth2AccountLinkService.java
│   │   │
│   │   ├── rate_limit/
│   │   │   ├── RateLimitFilter.java
│   │   │   └── RateLimitService.java
│   │   │
│   │   └── twofactor/
│   │       ├── TwoFactorService.java
│   │       └── TotpVerifier.java
│   │
│   ├── service/                    # Business logic
│   │   ├── AuthService.java
│   │   ├── UserService.java
│   │   ├── RefreshTokenService.java
│   │   ├── EmailService.java
│   │   ├── AuditService.java
│   │   └── SecurityEventService.java
│   │
│   ├── controller/                 # REST endpoints
│   │   ├── AuthController.java
│   │   ├── TwoFactorController.java
│   │   ├── AdminController.java
│   │   └── HealthController.java
│   │
│   ├── dto/                        # Request / Response objects
│   │   ├── request/
│   │   │   ├── LoginRequest.java
│   │   │   ├── RegisterRequest.java
│   │   │   ├── RefreshRequest.java
│   │   │   └── TwoFactorRequest.java
│   │   │
│   │   └── response/
│   │       ├── AuthResponse.java
│   │       └── ErrorResponse.java
│   │
│   ├── exception/                  # Centralized exception handling
│   │   ├── GlobalExceptionHandler.java
│   │   ├── AuthException.java
│   │   ├── TokenException.java
│   │   └── RateLimitException.java
│   │
│   ├── util/
│   │   ├── IpUtils.java
│   │   ├── DeviceUtils.java
│   │   └── SecurityUtils.java
│   │
│   └── infrastructure/              # External system integrations
│       ├── redis/
│       ├── mail/
│       └── audit/
│
└── resources/
├── application.yml
├── db/migration/ (Flyway)
└── keys/ (RSA keys)
```


