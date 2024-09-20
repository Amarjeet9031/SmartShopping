package dao;

import beans.Product;


import java.util.List;


public interface ProductDao {
   Product createProduct(Product product);
   List<Product> getAllProduct();
//   Product getProduct(int pid);
//   Product updateProduct(int pid, Product updatedUser);
//   String deleteProduct(String pid);
}
