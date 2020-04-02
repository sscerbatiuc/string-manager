package com.step.service;

/**
 *
 * @author sscerbatiuc
 */
public class StringManager implements IStringManager {

    private String[] values;
    private int counter = 0;

    public StringManager() {
        // [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
        this.values = new String[100];
    }

    // add, view, delete, edit
    @Override
    public void add(String value) throws IncorrectArgumentException {
        if (counter + 1 == 100) {
            return;
        }
        
        // daca valoarea mai exista in array, atunci nu introducem in memorie
         // [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
        for(String val: this.values){ // null
            if(val != null && val.equals(value)) {
             throw new IncorrectArgumentException("Valoarea specificata deja exista: " + val);
            }
        }
        this.values[counter++] = value;
    }

    public String view(int index) {
        return this.values[index];
    }

    public void delete(int index) {
        this.values[index] = null;
    }

    public void edit(int index, String newValue) {
        this.values[index] = newValue;
    }

}
