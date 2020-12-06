package voucher.app.productcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import voucher.app.productcatalog.model.Product;
import voucher.app.productcatalog.dao.ProductDao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService(@Qualifier("productDao") ProductDao productDao) {
        this.productDao = productDao;
    }

    public int addProduct(Product product) {
        return productDao.insertProduct(product);
    }

    public List<Product> getProducts(){
        return productDao.selectProducts();
    }

    public Optional<Product> getProductById(UUID productId){
        return productDao.selectProductById(productId);
    }
}
