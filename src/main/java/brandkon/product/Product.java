package brandkon.product;

import brandkon.brand.Brand;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Product {

    private String Name;

    private int price;

    private String imageUrl;

    private int expirationDays;

    private String guidelines;

    @ManyToOne
    private Brand brand;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected Product() {

    }

    public Product(Brand brand, int expirationDays, String guidelines, String imageUrl, String name, int price) {
        this.brand = brand;
        this.expirationDays = expirationDays;
        this.guidelines = guidelines;
        this.imageUrl = imageUrl;
        Name = name;
        this.price = price;
    }

    public String getGuidelines() {
        return guidelines;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public Brand getBrand() {
        return brand;
    }

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && id == product.id && Objects.equals(Name, product.Name) && Objects.equals(imageUrl, product.imageUrl) && Objects.equals(brand, product.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, price, imageUrl, brand, id);
    }
}
