package daoImp;

import beans.Product;

import dao.ProductDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import util.HibernateUtil;


import java.util.List;
import java.util.Scanner;

public class ProductDaoImp implements ProductDao {


    Scanner sc=new Scanner(System.in);
    public Product createProduct(Product product){
        try(SessionFactory sessionFactory= HibernateUtil.getSessionFactory()){
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            session.getTransaction();
            session.save(product);
            session.getTransaction().commit();
            return product;


        }
        catch (HibernateException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        try(Session session=HibernateUtil.getSession()){
            Query query=session.createQuery("FROM Product",Product.class);
          List<Product> productList=query.list();
          for(Product List:productList){
              System.out.println(List);
          }
         return productList;

        }
        catch (HibernateException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

//    @Override
//    public User getProduct(int uid) {
//        return null;
//    }
//
//    @Override
//    public User updateProduct(int uid, User updatedUser) {
//        return null;
//    }
//
//    @Override
//    public String deleteProduct(String uid) {
//        return "";
//    }

}
