package brandkon.populatProduct;

import brandkon.populatProduct.DTO.PopularProductResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularProductService {

    private final PopularProductRepository productRepository;

    public PopularProductService(PopularProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //인기 상품 목록 조회
    public List<PopularProductResponseDto> findAll() {
        List<PopulatProduct> all = productRepository.findAll();
        List<PopularProductResponseDto> findAll = all.stream()
                .map(populatProduct -> new PopularProductResponseDto(populatProduct.getId(),
                        populatProduct.getBrand().getName(), populatProduct.getName(), populatProduct.getPrice(),
                        populatProduct.getImageUrl()))
                .toList();
        return findAll;
    }

}
