package voucher.app.productcatalog.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Product {
    private final UUID productId;
    private final String productName;
    private String description;
    private final String productImage;
    private final int productPrice;

    public Product(@JsonProperty("productId") UUID productId,
                   @JsonProperty("productName") String productName,
                   @JsonProperty("productImage") String productImage,
                   @JsonProperty("productPrice") int productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
    }
    public UUID getId() {
        return productId;
    }
    public String getName() {
        return productName;
    }
    public String getImage() {
        return productImage;
    }
    public int getPrice() {
        return productPrice;
    }
}
