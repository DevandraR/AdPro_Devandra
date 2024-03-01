package id.ac.ui.cs.advprog.eshop.repository;

import java.util.Iterator;

import id.ac.ui.cs.advprog.eshop.model.Product;

public class DeleteProduct {
    private ProductRepository productRepository;

    public DeleteProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean deleteProduct(String productId) {
        for (Iterator<Product> iterator = productRepository.productData.iterator(); iterator.hasNext(); ) {
            Product product = iterator.next();
            if (product.getProductId().equals(productId)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}