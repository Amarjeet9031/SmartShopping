package services;

import beans.Customer;



import java.util.List;

public interface CustomerServices{
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomer();
}


