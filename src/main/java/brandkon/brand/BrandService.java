package brandkon.brand;

import brandkon.brand.DTO.BrandResponseDto;
import brandkon.category.Category;
import brandkon.category.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepository brandRepository;
    private final CategoryRepository categoryRepository;

    public BrandService(BrandRepository brandRepository, CategoryRepository categoryRepository) {
        this.brandRepository = brandRepository;
        this.categoryRepository = categoryRepository;
    }

    //브랜드 목록 조회
    public List<BrandResponseDto> findBrands(String category) {
        List<Brand> byCategoryName = brandRepository.findByCategorySlug(category);
        List<BrandResponseDto> findBrands = byCategoryName.stream()
                .map(brand -> new BrandResponseDto(brand.getId(), brand.getName(), brand.getImageUrl()))
                .toList();
        return findBrands;
    }

    // 브랜드 상세 조회
    public BrandResponseDto findDetailBrand(long brandId) {
        Brand find = brandRepository.findById(brandId).orElseThrow();
        BrandResponseDto detailBrand = new BrandResponseDto(find.getId(), find.getName(), find.getImageUrl());
        return detailBrand;
    }
}
