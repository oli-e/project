package voucher.app.productcatalog.dao;

import org.springframework.stereotype.Repository;
import voucher.app.productcatalog.model.Product;

import javax.swing.text.html.Option;
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
        Optional<Product> uselessProduct = selectProductById(productId);
        if (uselessProduct.isEmpty()){
            return 0;
        }
        DB.remove(uselessProduct.get());
        return 1;
    }

    @Override
    public int updateProductById(UUID productId, Product product) {
        return selectProductById(productId)
                .map(product1 -> {
                int indexOfProductToDelete = DB.indexOf(product1);
                if (indexOfProductToDelete >= 0 ){
                    DB.set(indexOfProductToDelete, new Product(productId, product.getName(), product.getImage(), product.getPrice()));
                    return 1;
                }
                return 0;
            })
            .orElse(0);
    }
}
