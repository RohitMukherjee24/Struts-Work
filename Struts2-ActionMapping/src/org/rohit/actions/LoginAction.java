package org.rohit.actions;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by rohit on 1/25/2017.
 */
public class LoginAction extends ActionSupport {
    public String userId;
    public String password;
//    private static String SUCCESS = "success";

    public void validate(){
        if(StringUtils.isEmpty(getUserId())){
            addFieldError("userId","UserId cannot be blank");
        }
        if(StringUtils.isEmpty(getPassword())){
            addFieldError("password","password cannot be blank");
        }

    }

    public String execute(){

        if(getUserId().equals("userId") && getPassword().equals("password")){
            return SUCCESS;
        }
        return LOGIN;
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
