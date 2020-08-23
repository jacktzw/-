public class Bread {
    private int id;//定义面包编号
    private String productName;//定义生产者名称

    public Bread(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
