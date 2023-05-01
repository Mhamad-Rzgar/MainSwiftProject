
package Models;

public class SellingModel {

    private int prodictId;
    private int quantity;
    private double discount;

    public SellingModel(int prodictId, int quantity, double discount) {
        this.prodictId = prodictId;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setProdictId(int prodictId) throws Exception {
        this.prodictId = prodictId;
    }

    public void setQuantity(int quantity) throws Exception {
        this.quantity = quantity;
    }

    public void setDiscount(double discount) throws Exception {
        this.discount = discount;
    }

    public int getProdictId() {
        return prodictId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

}
