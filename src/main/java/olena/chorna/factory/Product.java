package olena.chorna;

import java.util.UUID;

public class Product {
    private UUID productId;

    public Product(UUID productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                '}';
    }
}

