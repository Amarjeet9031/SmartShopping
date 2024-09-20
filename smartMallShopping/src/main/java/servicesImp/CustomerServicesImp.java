package servicesImp;


import beans.Customer;



import dao.CustomerDao;
import daoImp.CustomerDaoImp;
import services.CustomerServices;

import java.util.List;


public class CustomerServicesImp implements CustomerServices {
    CustomerDao customerDao=new CustomerDaoImp();

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.createCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }



}

