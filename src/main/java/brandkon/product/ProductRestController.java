package brandkon.product;

import brandkon.product.DTO.DetailProductResponseDto;
import brandkon.product.DTO.ProductResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<ProductResponseDto> findAll(@RequestParam("brandId") Long brandId) {
        return productService.findAll(brandId);
    }

    //상품 상세 조회
    @GetMapping("/products/{productId}")
    private DetailProductResponseDto find(@PathVariable long productId) {
        return productService.findById(productId);
    }

    //인기 상품 목록 조회
    @GetMapping("/products/popular")
    private List<ProductResponseDto> popular(@RequestParam(value = "categoryId", required = false) Long categoryId,
                                             @RequestParam(value = "brandId", required = false) Long brandId) {
        if (categoryId != null) {
            return productService.popularCategory(categoryId);
        }
        if (brandId != null) {
            return productService.popularBrand(brandId);
        }
        return null;
    }
}
