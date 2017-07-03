package com.github.fabtesta.pcml2java.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;

/**
 * Created by ftesta on 03/07/2017.
 */
public class ArrayOfStringsElementSizeValidator implements ConstraintValidator<ArrayOfStringsElementSize, ArrayList<String>> {

    private int singleElementSize;

    @Override
    public void initialize(ArrayOfStringsElementSize primitiveArrayElementSize) {
        singleElementSize = primitiveArrayElementSize.singleElementSize();
    }

    @Override
    public boolean isValid(ArrayList<String> arrayList, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;

        for(String element : arrayList)
        {
            isValid = element.length() <= singleElementSize;
            if(!isValid) {
                break;
            }
        }

        return isValid;
    }
}
