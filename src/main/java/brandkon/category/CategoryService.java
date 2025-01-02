package brandkon.category;

import brandkon.category.DTO.CategoryResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // 카테고리 목록 조회
    public List<CategoryResponseDto> findCategories() {
        List<Category> all = categoryRepository.findAll();
        List<CategoryResponseDto> finds = all.stream()
                .map(category -> new CategoryResponseDto(category.getId(), category.getName(), category.getSlug()
                        , category.getImageUrl()))
                .toList();
        return finds;
    }
}
