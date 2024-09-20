package services;

import beans.Product;


import java.util.List;


public interface ProductServices {
     Product createProduct(Product product);
     List<Product> getAllProduct();

     Product getProduct(int pid);

     Product updatedProductData(int uid, Product product);

     String deleteProduct(int pid);
}
