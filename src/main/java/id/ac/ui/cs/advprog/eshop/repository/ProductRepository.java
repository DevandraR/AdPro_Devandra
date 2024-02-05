package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findByProductName(String productName) {
        for (Product product : productData) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public boolean delete(String productName) {
        for (Iterator<Product> iterator = productData.iterator(); iterator.hasNext(); ) {
            Product product = iterator.next();
            if (product.getProductName().equals(productName)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}