package servicesImp;

import beans.Product;


import dao.ProductDao;

import daoImp.ProductDaoImp;
import services.ProductServices;


import java.util.List;


public class ProductServicesImp implements ProductServices {
    ProductDao productDao=new ProductDaoImp() ;


    @Override
    public Product createProduct(Product product) {
        return productDao.createProduct(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }

    @Override
    public Product getProduct(int pid) {
        return null;
    }

    @Override
    public Product updatedProductData(int uid, Product product) {
        return null;
    }

    @Override
    public String deleteProduct(int pid) {
        return "";
    }
}
