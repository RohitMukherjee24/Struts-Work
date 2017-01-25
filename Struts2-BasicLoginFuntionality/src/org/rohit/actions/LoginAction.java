package org.rohit.actions;



/**
 * Created by rohit on 1/25/2017.
 */
public class LoginAction {
    public String userId;
    public String password;

    public String execute(){
        if(getUserId().equals("userId") && getPassword().equals("password")){
            return "success";
        }
        return  "failure";
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
