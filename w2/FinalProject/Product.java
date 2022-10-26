package w2.FinalProject;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private final String id;
    private final String name;
    private final Category category;
    private final Money price;

    public Product(String id, String name, Category category, Money price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Money getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(final Product o) {
        int thisNumber = Integer.parseInt(id.substring(7));
        int otherNumber = Integer.parseInt(o.id.substring(7));
        return thisNumber - otherNumber;
    }
    public enum Category {
        HOBBY,
        CLOTHES,
        GARDEN,
        AUTOMOTIVE
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                '}';
    }
}
