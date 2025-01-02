package brandkon.brand;

import brandkon.category.Category;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Brand {

    private String name;

    private String imageUrl;

    @ManyToOne
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected Brand() {
    }

    public Brand(Category category, String imageUrl, String name) {
        this.category = category;
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public Category getCategory() {
        return category;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return id == brand.id && Objects.equals(name, brand.name) && Objects.equals(imageUrl, brand.imageUrl) && Objects.equals(category, brand.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageUrl, category, id);
    }
}
