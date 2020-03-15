package SS17.IO_Binary_File_Va_Serialization.employee_manager;

public class Employee {
    private String productCode;
    private String nameProduct;
    private String producer;
    private float price;
    private String desciption;

    public Employee() {
    }

    public Employee(String productCode, String nameProduct, String producer, float price, String desciption) {
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
        this.desciption = desciption;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
