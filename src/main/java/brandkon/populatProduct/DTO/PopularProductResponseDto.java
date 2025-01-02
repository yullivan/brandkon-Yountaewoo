package brandkon.populatProduct.DTO;

public record PopularProductResponseDto(
        long id,
        String brandName,
        String productName,
        int price,
        String imageUrl
) {
}
