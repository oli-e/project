package voucher.app.productcatalog.connectionTests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import voucher.app.productcatalog.api.ProductController;

@SpringBootTest
public class CreateProductControllerTest {

    @Autowired
    private ProductController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}