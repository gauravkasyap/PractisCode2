class Product {
    private String productName;
    private float price;
    private int stock;

    public void product(String productName, float price, int stock ){
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public float calculateFinalPrice(int discountPercentage) {
        float discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

public class UnitTestAss1 {
    public static void main(String[] args) {
    Product product = new Product();
    product.product("heelo",50,5);
        System.out.println(product.calculateFinalPrice(5));
    }
}
