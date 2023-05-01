package Models;

public class ItemsModel {

    private String commercialName;
    private String ScinteficName;
    private String barcode;
    private String brand;
    private String type;
    private String category;
    private String quantity;
    private String expireDate;
    private String buyingPrice;
    private String sellingPrice;

    public ItemsModel(String commercialName, String ScinteficName, String barcode, String brand, String type, String category, String quantity, String expireDate, String buyingPrice, String sellingPrice) throws Exception {

        if (commercialName.isEmpty()) {
            throw new Exception("commercialName Required");
        }
        if (ScinteficName.isEmpty()) {
            throw new Exception("ScinteficName Required");
        }
        if (barcode.isEmpty()) {
            throw new Exception("barcode Required");
        }
        if (brand.isEmpty()) {
            throw new Exception("brand Required");
        }
        if (type.isEmpty()) {
            throw new Exception("item type Required");
        }
        if (category == null || category.isEmpty()) {
            throw new Exception("category Required");
        }

        if (quantity == null || quantity.isEmpty()) {
            throw new Exception("quantity Required");
        }
        if (expireDate == null || expireDate.isEmpty()) {
            throw new Exception("expireDate Required");
        }
        if (buyingPrice == null || buyingPrice.isEmpty()) {
            throw new Exception("buyingPrice Required");
        }
        if (sellingPrice == null || sellingPrice.isEmpty()) {
            throw new Exception("sellingPrice Required");
        }

        this.commercialName = commercialName;
        this.ScinteficName = ScinteficName;
        this.barcode = barcode;
        this.brand = brand;
        this.type = type;
        this.category = category;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;

    }

    public void setCommercialName(String commercialName) throws Exception {
        if (commercialName.isEmpty()) {
            throw new Exception("commercialName Required");
        }

        this.commercialName = commercialName;
    }

    public void setScinteficName(String ScinteficName) throws Exception {
        if (ScinteficName.isEmpty()) {
            throw new Exception("ScinteficName Required");
        }

        this.ScinteficName = ScinteficName;
    }

    public void setBarcode(String barcode) throws Exception {
        if (barcode.isEmpty()) {
            throw new Exception("barcode Required");
        }

        this.barcode = barcode;
    }

    public void setBrand(String brand) throws Exception {
        if (brand.isEmpty()) {
            throw new Exception("brand Required");
        }

        this.brand = brand;
    }

    public void setType(String type) throws Exception {
        if (type.isEmpty()) {
            throw new Exception("item type Required");
        }
        this.type = type;
    }

    public void setCategory(String category) throws Exception {
        if (category.isEmpty()) {
            throw new Exception("category Required");
        }
        this.category = category;
    }

    public void setQuantity(String quantity) throws Exception {
        if (quantity.isEmpty()) {
            throw new Exception("quantity Required");
        }
        this.quantity = quantity;
    }

    public void setExpireDate(String expireDate) throws Exception {
        if (expireDate.isEmpty()) {
            throw new Exception("expireDate Required");
        }
        this.expireDate = expireDate;
    }

    public void setBuyingPrice(String buyingPrice) throws Exception {
        if (buyingPrice.isEmpty()) {
            throw new Exception("buyingPrice Required");
        }
        this.buyingPrice = buyingPrice;
    }

    public void setSellingPrice(String sellingPrice) throws Exception {
        if (sellingPrice.isEmpty()) {
            throw new Exception("sellingPrice Required");
        }
        this.sellingPrice = sellingPrice;
    }

    public String getScinteficName() {
        return ScinteficName;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getCatigory() {
        return category;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getBuyingPrice() {
        return buyingPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public String getStrData() {
        return """
               The Data Your enterd Successflully is:
               Commercial Name: """ + commercialName
                + "\nScientific Name: " + ScinteficName
                + "\nBarcode Data: " + barcode
                + "\nBrand name: " + brand
                + "\nType: " + type
                + "\nUnit: " + category;
    }

}
