package brandkon.product;

import brandkon.brand.DTO.BrandResponseDto;
import brandkon.product.DTO.DetailProductResponseDto;
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
    public List<ProductResponseDto> findALl(Long brandId) {
        List<Product> byBrandId = productRepository.findByBrandId(brandId);
        List<ProductResponseDto> findALl = byBrandId.stream()
                .map(product -> new ProductResponseDto(product.getId(), product.getBrand().getName(),
                        product.getName(), product.getPrice(), product.getImageUrl()))
                .toList();
        return findALl;
    }

    //상품 상세 조회
    public DetailProductResponseDto find(long productId) {
        Product find = productRepository.findById(productId).orElseThrow();
        DetailProductResponseDto.Brand brand = new DetailProductResponseDto.Brand(find.getBrand().getId(),
                find.getBrand().getName(), find.getBrand().getGuidelines());
        DetailProductResponseDto detail = new DetailProductResponseDto(find.getId(), find.getName(), find.getPrice(),
                brand, find.getExpirationDays());
        return detail;
    }

    //인기 상품 목록 조회(카테고리 내에서)
    public List<ProductResponseDto> popularCategory(Long categoryId) {
        List<Product> finds = productRepository.findTop5ByBrandCategory_IdOrderBySalesVolumeDesc(categoryId);
        List<ProductResponseDto> popularCategory = finds.stream()
                .map(product -> new ProductResponseDto(product.getId(), product.getBrand().getName(), product.getName(),
                        product.getPrice(), product.getImageUrl()))
                .toList();
        return popularCategory;
    }

    //인기 상품 목록 조회(브랜드 내에서)
    public List<ProductResponseDto> popularBrand(Long brandId) {
        List<Product> finds = productRepository.findTop5ByBrandIdOrderBySalesVolumeDesc(brandId);
        List<ProductResponseDto> popularBrand = finds.stream()
                .map(product -> new ProductResponseDto(product.getId(), product.getBrand().getName(), product.getName()
                        , product.getPrice(), product.getImageUrl()))
                .toList();
        return popularBrand;
    }
}
