package voucher.app.productcatalog.dao;

import org.springframework.stereotype.Repository;
import voucher.app.productcatalog.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("productDao")
public class ProductDataService implements ProductDao {

    private static List<Product> DB = new ArrayList<>();

    @Override
    public int insertProduct(UUID productId, Product product) {
        DB.add(new Product(productId, product.getName(), product.getImage(), product.getPrice()));
        return 0;
    }

    @Override
    public List<Product> selectProducts() {
        return DB;
    }

    @Override
    public Optional<Product> selectProductById(UUID productId) {
        return DB.stream()
                .filter(product -> product.getId().equals(productId))
                .findFirst();
    }

    @Override
    public int deleteProductById(UUID productId) {
        return 0;
    }

    @Override
    public int updateProductById(UUID productId, Product product) {
        return 0;
    }
}
