package brandkon.product;

import brandkon.product.DTO.ProductResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //상품 목록 조회
    public List<ProductResponseDto> findALl() {
        List<Product> finds = productRepository.findAll();
        List<ProductResponseDto> findALl = finds.stream()
                .map(product -> new ProductResponseDto(product.getId(), product.getBrand().getName(),
                        product.getName(), product.getPrice(), product.getImageUrl()))
                .toList();
        return findALl;
    }
}
