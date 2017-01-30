package org.rohit.actions;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;

/**
 * Created by rohit on 1/29/2017.
 */
public class AutoCompleteAction extends ActionSupport {

    public ArrayList<String> listOfStates=new ArrayList<String>();
    public String state;
    public String execute()
    {
        populatelistOfStates();
        return SUCCESS;
    }

    public void populatelistOfStates()
    {// i am taking few states here with same first character.you can have all states
        listOfStates.add("Andhra Pradesh");
        listOfStates.add("Maharastra");
        listOfStates.add("Madhya Pradesh");
        listOfStates.add("Meghalaya");
        listOfStates.add("Karnataka");
        listOfStates.add("Kerala");
    }
}
