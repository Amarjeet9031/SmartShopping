package dao;

import beans.Customer;



import java.util.List;

public interface CustomerDao {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomer();
}
