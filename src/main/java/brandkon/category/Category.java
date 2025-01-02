package brandkon.category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Category {

    private String name;

    private String slug;

    private String imageUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected Category() {
    }

    public Category(String imageUrl, String name, String slug) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.slug = slug;
    }

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id && Objects.equals(name, category.name) && Objects.equals(slug, category.slug) && Objects.equals(imageUrl, category.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, slug, imageUrl, id);
    }
}
