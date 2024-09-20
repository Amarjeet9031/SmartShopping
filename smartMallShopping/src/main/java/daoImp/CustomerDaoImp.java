package daoImp;

import beans.Customer;

import dao.CustomerDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;



import java.util.List;
import java.util.Scanner;

public class CustomerDaoImp implements CustomerDao {


    Scanner sc=new Scanner(System.in);
    public Customer createCustomer(Customer customer){
        try(Session session=HibernateUtil.getSession()){
            session.beginTransaction();

            session.save(customer);
            session.getTransaction().commit();
            return customer;


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
    public List<Customer> getAllCustomer() {
        try(Session session=HibernateUtil.getSession()){
            Query query=session.createQuery("FROM Customer",Customer.class);
            List<Customer> customerList=query.list();
            for(Customer List:customerList){
                System.out.println(List);
            }
//            return customerList;
            return customerList;

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
