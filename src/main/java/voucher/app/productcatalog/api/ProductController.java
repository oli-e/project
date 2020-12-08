package voucher.app.productcatalog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voucher.app.productcatalog.model.Product;
import voucher.app.productcatalog.service.ProductService;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/product")
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping(path ="{productId}")
    public Product getProductById(@PathVariable("productId") UUID productId){
        return productService.getProductById(productId).orElse(null);
    }

    @DeleteMapping(path ="{productId}")
    public void deleteProductById(@PathVariable("productId") UUID productId){
        productService.deleteProduct(productId);
    }

    @PutMapping(path ="{productId}")
    public void updateProduct(@PathVariable("productId") UUID productId, @RequestBody Product product){
        productService.updatePerson(productId, product);
    }
}
