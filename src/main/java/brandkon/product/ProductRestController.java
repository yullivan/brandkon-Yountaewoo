package brandkon.product;

import brandkon.product.DTO.ProductResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    private ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    //상품 목록 조회
    @GetMapping("/products")
    public List<ProductResponseDto> findAll() {
        return productService.findALl();
    }
}
