package vn.fs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.fs.dto.ProductCSV;
import vn.fs.entity.Product;
import vn.fs.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CsvService {

    private final ProductRepository productRepository;

    public List<Product> products(List<ProductCSV> productCSV) {
        List<Product> products = new ArrayList<>();

        for (ProductCSV p : productCSV) {
            Product product = new Product();
            product.setName(p.getName());
            product.setQuantity(p.getQuantity());
            product.setPrice(p.getPrice());
            product.setDiscount(p.getDiscount());
            product.setDescription(p.getDescription());
            product.setCategory(p.getCategory());
            products.add(product);
        }
        return productRepository.saveAll(products);
    }

}
