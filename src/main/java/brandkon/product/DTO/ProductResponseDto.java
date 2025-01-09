package brandkon.product.DTO;

public record ProductResponseDto(
        long id,
        String brandName,
        String productName,
        int price,
        String imageUrl
) {
}
