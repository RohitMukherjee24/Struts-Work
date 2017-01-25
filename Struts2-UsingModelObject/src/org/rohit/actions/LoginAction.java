package org.rohit.actions;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.lang3.StringUtils;
import org.rohit.model.User;
import org.rohit.service.LoginService;

/**
 * Created by rohit on 1/25/2017.
 */
public class LoginAction extends ActionSupport implements ModelDriven {
    private String userId;
    private String password;
    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void validate(){
        if(StringUtils.isEmpty(user.getUserId())){
            addFieldError("userId","UserId cannot be blank");
        }
        if(StringUtils.isEmpty(user.getPassword())){
            addFieldError("password","password cannot be blank");
        }

    }

    public String execute(){

        LoginService loginService = new LoginService();

        if(loginService.verifyLogin(user)){
            return SUCCESS;
        }
        return LOGIN;
    }
    
    @Override
    public Object getModel() {
        return user;
    }
}
