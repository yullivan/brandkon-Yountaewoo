package brandkon.brand;

import brandkon.brand.DTO.BrandResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    //브랜드 목록 조회
    public List<BrandResponseDto> findBrands() {
        List<Brand> all = brandRepository.findAll();
        List<BrandResponseDto> finds = all.stream()
                .map(brand -> new BrandResponseDto(brand.getId(), brand.getName(), brand.getImageUrl()))
                .toList();
        return finds;
    }
}
