package voucher.app.productcatalog;

import voucher.app.productcatalog.model.Product;

import java.util.UUID;

public class ProductCatalogFacade {

    public boolean isExists(String productId) {
        return false;
    }

    public String createProduct() {
        return UUID.randomUUID().toString();
    }

    public Product getById(String productId) {
        return null;
    }
}
