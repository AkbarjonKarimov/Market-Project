package CRM.products;

public class Product {
    private String name;
    private Double price;
    private String type;
    private Double amount;
    private String unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        char[] charArray = name.toCharArray();
        if(charArray.length>2){
            this.name = name;
        }else {
            System.out.println("Name should be 3 or more character");
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Product() {

    }

    public Product(String name, Double price, String type, Double amount, String unit) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", unit='" + unit;
    }
}
