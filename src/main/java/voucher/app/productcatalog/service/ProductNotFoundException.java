package voucher.app.productcatalog.service;

public class ProductNotFoundException extends IllegalStateException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
