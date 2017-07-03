package com.github.fabtesta.test.bean;

import com.github.fabtesta.pcml2java.validators.ArrayOfStringsElementSize;

import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by ftesta on 03/07/2017.
 */
public class AnnotatedTestClass {

    @ArrayOfStringsElementSize(singleElementSize =  2)
    @Size(max = 10)
    private ArrayList<String> listOfStrings;

    public AnnotatedTestClass() {
        listOfStrings = new ArrayList<>();
    }

    public ArrayList<String> getListOfStrings() {
        return listOfStrings;
    }

    public void setListOfStrings(ArrayList<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }
}
