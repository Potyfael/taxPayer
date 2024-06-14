package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct() {
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price + customsFee);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public final String priceTag() {
        return super.priceTag() + "(Customs Fee: " + customsFee + ")";
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

}
