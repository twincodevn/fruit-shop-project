
package model;

public class Fruit {
    private int id;
    private String name;
    private String image;
    private Category category;
    private double price;
    private String description;

    // Default constructor
    public Fruit() {
    }

    // Parameterized constructor
    public Fruit(String name, String image, Category category, double price, String description) {
        this.name = name;
        this.image = image;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", categoryId=" + category +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

