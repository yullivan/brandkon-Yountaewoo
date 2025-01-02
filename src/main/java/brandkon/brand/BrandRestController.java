package brandkon.brand;

import brandkon.brand.DTO.BrandResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandRestController {

    private BrandService brandService;

    public BrandRestController(BrandService brandService) {
        this.brandService = brandService;
    }

    // 브랜드 목록 조회
    @GetMapping("/brands")
    public List<BrandResponseDto> findBrands() {
        return brandService.findBrands();
    }

    // 브랜드 상세 조회
    @GetMapping("/brands/{brandId}")
    public BrandResponseDto brand(@PathVariable long brandId) {
        return brandService.findDetailBrand(brandId);
    }
}
