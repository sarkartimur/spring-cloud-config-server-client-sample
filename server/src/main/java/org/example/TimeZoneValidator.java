package org.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.ZoneId;

public class TimeZoneValidator implements ConstraintValidator<TimeZoneConstraint, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return ZoneId.getAvailableZoneIds().stream().anyMatch(zoneId -> zoneId.equals(value));
    }
}