package com.github.fabtesta.test;

import com.github.fabtesta.test.bean.AnnotatedTestClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import static org.junit.Assert.assertEquals;

/**
 * Created by ftesta on 03/07/2017.
 */
public class ValidatorTests {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testSingleArrayElementIsIncorrect() {
        AnnotatedTestClass testClass = new AnnotatedTestClass();

        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("KO2");

        Set<ConstraintViolation<AnnotatedTestClass>> violations = validator.validate(testClass);
        assertEquals(1, violations.size());
    }

    @Test
    public void testArraySizeAndSingleElementsSizeIsCorrect() {
        AnnotatedTestClass testClass = new AnnotatedTestClass();

        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");

        Set<ConstraintViolation<AnnotatedTestClass>> violations = validator.validate(testClass);
        assertEquals(0, violations.size());
    }

    @Test
    public void testArraySizeAndSingleArrayElementIsIncorrect() {
        AnnotatedTestClass testClass = new AnnotatedTestClass();

        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("KO1");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");
        testClass.getListOfStrings().add("OK");

        Set<ConstraintViolation<AnnotatedTestClass>> violations = validator.validate(testClass);
        assertEquals(2, violations.size());
    }
}
