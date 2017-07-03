package com.github.fabtesta.pcml2java.validators;

/**
 * Created by ftesta on 03/07/2017.
 */

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = ArrayOfStringsElementSizeValidator.class)
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface ArrayOfStringsElementSize {
    String message() default "The array '${validatedValue}' contains an element that has a length greater then {singleElementSize}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    int singleElementSize();
}
