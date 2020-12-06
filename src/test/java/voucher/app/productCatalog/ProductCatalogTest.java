package voucher.app.productCatalog;

import org.junit.Assert;
import org.junit.Test;
import voucher.app.productcatalog.model.Product;
import voucher.app.productcatalog.ProductCatalogFacade;

public class ProductCatalogTest {
    @Test
    public void itAllowsCreateProduct() {
        //Arrange
        ProductCatalogFacade api = thereisProductCatalog();
        //Act
        String productId = api.createProduct();
        Product loaded = api.getById(productId);

        //Assert
        Assert.assertTrue(api.isExists(productId));
        Assert.assertEquals(productId, loaded.getId());
    }

    @Test
    public void  itAllowsLoadProduct() {
        //Arrange
        ProductCatalogFacade api = thereisProductCatalog();
        //Act
        String productId = api.createProduct();
        Product loaded = api.getById(productId);

        //Assert
        Assert.assertTrue(api.isExists(productId));
        Assert.assertEquals(productId, loaded.getId());
    }



    private ProductCatalogFacade thereisProductCatalog() {
        return new ProductCatalogFacade();
    }


}
