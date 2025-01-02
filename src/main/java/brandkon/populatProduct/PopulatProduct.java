package brandkon.populatProduct;

import brandkon.brand.Brand;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class PopulatProduct {

    private String name;

    private int price;

    private String imageUrl;

    @ManyToOne
    private Brand brand;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected PopulatProduct() {

    }

    public PopulatProduct(Brand brand, String imageUrl, String name, int price) {
        this.brand = brand;
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
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
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PopulatProduct that = (PopulatProduct) o;
        return price == that.price && id == that.id && Objects.equals(name, that.name) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, imageUrl, brand, id);
    }
}
