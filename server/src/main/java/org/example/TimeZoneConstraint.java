package org.example;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TimeZoneValidator.class)
@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeZoneConstraint {

    String message() default "Invalid time zone";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}