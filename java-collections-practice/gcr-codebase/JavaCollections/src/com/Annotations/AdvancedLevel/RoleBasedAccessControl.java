package com.Annotations.AdvancedLevel;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class RoleBasedAccessControl {

    // Annotation 
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface RoleAllowed {
        String value();
    }
    
    // Service
    static class AdminService {

        @RoleAllowed("ADMIN")
        public void deleteUser() {
            System.out.println("User deleted successfully");
        }
    }

    public static void main(String[] args) throws Exception {

        String currentUserRole = "USER"; // change to ADMIN to allow

        AdminService service = new AdminService();
        Method method = service.getClass().getMethod("deleteUser");

        RoleAllowed role = method.getAnnotation(RoleAllowed.class);

        if(role.value().equals(currentUserRole)) {
            method.invoke(service);
        }else {
            System.out.println("Access Denied!");
        }
    }
}
