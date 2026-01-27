package com.day1.AutoAuditSystem;

public class UserService {

    @AuditTrail(action = "USER_LOGIN")
    public void login() {}

    @AuditTrail(action = "FILE_UPLOAD")
    public void uploadFile() {}
}
