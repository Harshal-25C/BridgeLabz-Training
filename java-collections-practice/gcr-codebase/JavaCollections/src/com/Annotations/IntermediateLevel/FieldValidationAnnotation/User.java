package com.Annotations.IntermediateLevel.FieldValidationAnnotation;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String value) {
        try{
            var field = this.getClass().getDeclaredField("username");

            if(field.isAnnotationPresent(MaxLength.class)) {
                MaxLength max = field.getAnnotation(MaxLength.class);

                if(value.length() > max.value()) {
                    throw new IllegalArgumentException(
                        "Username length exceeds " + max.value()
                    );
                }
            }
        }catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return username;
    }
}
