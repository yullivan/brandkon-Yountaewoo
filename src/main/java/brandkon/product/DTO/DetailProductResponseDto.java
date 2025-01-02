package brandkon.product.DTO;

import brandkon.brand.Brand;

public record DetailProductResponseDto(
        long productId,
        String productName,
        int price,
        Brand brand,
        int expirationDays
) {
    record Brand(
            long id,
            String name,
            String guidelines
    ) {
    }
}
