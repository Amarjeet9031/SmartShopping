package servicesImp;

import beans.User;
import dao.UserDao;
import daoImp.UserDaoImp;

import services.UserServices;

import java.util.List;

public class UserServicesImp implements UserServices {


UserDao userDao=new UserDaoImp();

    @Override
    public User createUser(User user) {

       return userDao.createUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public User getuser(int uid) {
        return userDao.getUser(uid);
    }

    @Override
    public User updatedUserData(int uid, User updateuser) {
        return userDao.updateUser(uid,updateuser);
    }

    @Override
    public User deleteUser(int uid) {
        return userDao.deleteUser(uid);
    }


}





