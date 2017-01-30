package org.rohit.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by rohit on 1/29/2017.
 */
public class DummyAction extends ActionSupport{
    public String execute(){
        System.out.println("In Action");
        return SUCCESS;
    }
}
