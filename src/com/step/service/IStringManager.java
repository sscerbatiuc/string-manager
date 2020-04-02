package com.step.service;

/**
 *
 * @author sscerbatiuc
 */
public interface IStringManager {
    
    public void add(String value) throws IncorrectArgumentException;
    public String view(int index);
    public void delete(int index);
    public void edit(int index, String newValue);
}
