package daoImp;

import beans.User;
import dao.UserDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;
import java.util.Scanner;



public class UserDaoImp implements UserDao {
    Scanner sc=new Scanner(System.in);


    @Override
    public User createUser(User user) {
        try(Session session=HibernateUtil.getSession()){

            session.beginTransaction();
//            user.setId(101);
//            user.setEmail("Amarjeet@gmail.com");
//            user.setPassword("12345");
//            user.setUserType("admin");
            session.save(user);
            session.getTransaction().commit();
            return user;
        }
       catch (HibernateException e){
           System.out.println(e);
       }
        catch (Exception e){
            System.out.println(e);
        }
       return null;
    }

    @Override
    public List<User> getAllUser() {
        try(Session session=HibernateUtil.getSession()) {

            //execute HQL query to retrieve all students data
            Query<User> query=session.createQuery("FROM User",User.class);

            List<User> userList=query.list();
            for(User List:userList){
                System.out.println(List);
            }
            return userList;

        }
        catch (HibernateException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }


        return null;
    }

    @Override
    public User getUser(int uid) {

        try(Session session=HibernateUtil.getSession()) {

            User user=session.get(User.class, uid);
            return user;
        }
        catch (HibernateException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    @Override
    public User updateUser(int uid, User updatedUser) {
        try(Session session=HibernateUtil.getSession()){
            User user=session.get(User.class,uid);

            session.beginTransaction();
            user.setId(uid);
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            user.setUserType(updatedUser.getUserType());

            session.saveOrUpdate(user);
            session.getTransaction().commit();
            return user;


        }
       catch (HibernateException e){
           System.out.println(e);
       }
        catch (Exception e){
            System.out.println(e);
        }
return null;
    }



    @Override
    public User deleteUser(int uid) {
        String message=null;
        try(Session session=HibernateUtil.getSession()){
            User user=session.get(User.class,uid);
            System.out.println("Are you sure you delete !!!!!!!!!!!!!!");
            String status=sc.next();
            if (status.equalsIgnoreCase("yes"))
            {
                session.delete(user);
                session.getTransaction().commit();
                session.evict(user);
                message="Object is Deleted";
            }else {
                message="User wants to retain this Object !!!!!!!!!!!!!!!!!";
            }
        }
        catch (HibernateException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }



    }

