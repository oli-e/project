package voucher.app.productcatalog.dao;

import voucher.app.productcatalog.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductDao {

    int insertProduct(UUID productId, Product product);

    default int insertProduct(Product product){
        UUID productId = UUID.randomUUID();
        return insertProduct(productId, product);
    }

    List<Product> selectProducts();

    Optional<Product> selectProductById(UUID productId);

    int deleteProductById(UUID productId);

    int updateProductById(UUID productId, Product product);
}
