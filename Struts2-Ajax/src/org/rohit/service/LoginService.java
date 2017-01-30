package org.rohit.service;

import org.rohit.model.User;

/**
 * Created by rohit on 1/25/2017.
 */
public class LoginService {

    public boolean verifyLogin(User user){
        if(user.getUserId().equals("userId") && user.getPassword().equals("password")){
            return true;
        }
        return false;
    }
}
