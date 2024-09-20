package services;


import beans.User;

import java.util.List;

public interface UserServices {

    User createUser(User user);

    List<User> getAllUser();

    User getuser(int uid);

    User updatedUserData(int uid, User updateuser);

    User deleteUser(int uid);


}