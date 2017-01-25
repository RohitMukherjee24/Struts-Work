package org.rohit.actions;


import com.opensymphony.xwork2.Action;

/**
 * Created by rohit on 1/25/2017.
 */
public class LoginAction implements Action {
    public String userId;
    public String password;
//    private static String SUCCESS = "success";

    public String execute(){
        if(getUserId().equals("userId") && getPassword().equals("password")){
            return SUCCESS;
        }
        return  LOGIN;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
