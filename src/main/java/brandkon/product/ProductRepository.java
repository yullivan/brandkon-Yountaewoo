package brandkon.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByBrandId(Long brandId);

    List<Product> findTop5ByBrandCategory_IdOrderBySalesVolumeDesc(Long categoryId);

    List<Product> findTop5ByBrandIdOrderBySalesVolumeDesc(Long brandId);
}
