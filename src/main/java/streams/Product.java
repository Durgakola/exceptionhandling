package streams;

public class Product {
    private String prdId;
    private String prdName;
    private String price;

    public Product(String prdId, String prdName, String price) {
        this.prdId = prdId;
        this.prdName = prdName;
        this.price = price;
    }

    public String getPrdId() {
        return prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public String getPrice() {
        return price;
    }
}
