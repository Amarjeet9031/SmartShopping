package dao;

import beans.User;

import java.util.List;

public interface UserDao {




    User createUser(User user);
    List<User> getAllUser();
    User getUser(int uid);
    User updateUser(int uid, User updatedUser);
    User deleteUser(int uid);

}
