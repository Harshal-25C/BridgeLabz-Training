package com.reflection.AdvancedLevelPrograms;

import java.lang.reflect.*;

public class CustomLoggingProxy {

    interface Greeting {
        void sayHello();
    }

    static class GreetingImpl implements Greeting {
        public void sayHello() {
            System.out.println("Hello, Harshal!");
        }
    }

    public static void main(String[] args) {

        Greeting target = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (obj, method, params) -> {
                    System.out.println("Calling method: " + method.getName());
                    return method.invoke(target, params);
                }
        );

        proxy.sayHello();
    }
}