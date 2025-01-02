package brandkon.populatProduct;

import brandkon.populatProduct.DTO.PopularProductResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PopularProductRestController {

    private PopularProductService popularProductService;

    public PopularProductRestController(PopularProductService popularProductService) {
        this.popularProductService = popularProductService;
    }

    //인기 상품 상세 조회
    @GetMapping("/products/popular")
    public List<PopularProductResponseDto> findALl() {
        return popularProductService.findAll();
    }
}
