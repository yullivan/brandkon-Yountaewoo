package brandkon.category.DTO;

public record CategoryResponseDto(
        long id,
        String name,
        String slug,
        String imageUrl
) {
}
