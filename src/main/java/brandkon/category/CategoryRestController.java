package brandkon.category;

import brandkon.category.DTO.CategoryResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryRestController {

    private CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // 카테고리 목록 조회
    @GetMapping("/categories")
    public List<CategoryResponseDto> findCategories() {
        return categoryService.findCategories();
    }
}
