package com.day1.AutoAuditSystem;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class EventTracker {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        Class<?> clazz = UserService.class;

        for(Method method : clazz.getDeclaredMethods()) {

            if(method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                ObjectNode log = mapper.createObjectNode();
                log.put("action", audit.action());
                log.put("method", method.getName());
                log.put("timestamp", LocalDateTime.now().toString());

                System.out.println(mapper.writeValueAsString(log));
            }
        }
    }
}
