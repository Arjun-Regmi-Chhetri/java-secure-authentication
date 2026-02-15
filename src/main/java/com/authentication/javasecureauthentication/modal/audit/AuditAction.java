package com.authentication.javasecureauthentication.modal.audit;

public enum AuditAction {
    LOGIN_SUCCESS,
    LOGIN_FAILED,
    PASSWORD_RESET,
    PASSWORD_CHANGE,
    TWO_FACTOR_SUCCESS,
    TWO_FACTOR_FAILED,
    ACCOUNT_LOCKED,
    TOKEN_REFRESH,
    LOGOUT
}