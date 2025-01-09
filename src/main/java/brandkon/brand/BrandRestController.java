package brandkon.brand;

import brandkon.brand.DTO.BrandResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandRestController {

    private final BrandService brandService;

    public BrandRestController(BrandService brandService) {
        this.brandService = brandService;
    }

    // 브랜드 목록 조회
    @GetMapping("/brands")
    public List<BrandResponse> findBrands(@RequestParam("category") String category) {
        return brandService.findBrands(category);
    }

    // 브랜드 상세 조회
    @GetMapping("/brands/{brandId}")
    public BrandResponse findById(@PathVariable long brandId) {
        return brandService.findDetailBrand(brandId);
    }
}
