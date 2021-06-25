package ChapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;


    public Invoice(String partNumber, String partDescription, int quantityPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityPurchased = quantityPurchased;
        this.pricePerItem = pricePerItem;
    }


    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        if (quantityPurchased < 0){
            quantityPurchased = 0;
    }
        if(pricePerItem < 0){
            pricePerItem = 0;
        }
        return quantityPurchased * pricePerItem;
    }
}
