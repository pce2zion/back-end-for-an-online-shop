package Modules;

public class Products {

    private Integer id;

    private String name;

    private Integer amount;

    private Integer numberOfProducts;

    public Products() {
    }

    public Products(Integer id, String name, Integer amount, Integer numberOfProducts) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.numberOfProducts = numberOfProducts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(Integer numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public String toString() {
        return "Modules.Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", numberOfProducts=" + numberOfProducts +
                '}';

    }
}
