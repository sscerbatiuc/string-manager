package com.step.service;

/**
 *
 * @author sscerbatiuc
 */
public class StringDbManager implements IStringManager{

    
    public StringDbManager(){
        // init
    }
    
    public void add(String value){
        // ...
    }
    
    public void edit(int position, String newValue){
        // ...
    }
    
    public void delete(int position){
        // ...
    }
    
    public String view(int position){
        throw new UnsupportedOperationException("Va fi implementat dupa ce vom sti cum functioneaza bd.");
    }
}
