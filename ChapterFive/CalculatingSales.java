package ChapterFive;

public class CalculatingSales {
    private int productNumber;
    private int quantitySold;


    public CalculatingSales() {
        this.productNumber = productNumber;
        this.quantitySold = quantitySold;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        quantitySold = quantitySold;
    }

    public double displayRetailPriceForProduct1() {
        double amount = 2.98;
        while (amount == 2.98) {
            if (quantitySold >= 500)
                return quantitySold * amount - (amount * 0.5);
            else if (quantitySold >= 400)
                return quantitySold * amount - (amount * 0.4);
            else if (quantitySold >= 300)
                return quantitySold * amount - (amount * 0.3);
            else if (quantitySold >= 200)
                return quantitySold * amount - (amount * 0.2);
            else if (quantitySold >= 100)
                return quantitySold * amount - (amount * 0.1);
        }
        return 0;
    }


    public double displayRetailPriceForProduct2(double quantitySold) {
        double amount = 4.50;
        while (amount == 4.50) {
            return this.displayRetailPriceForProduct1();

        }
        return 0;
    }


    public double displayRetailPriceForProduct3(double quantitySold) {
        double amount = 9.98;
        while (amount == 9.98) {
            return this.displayRetailPriceForProduct1();
        }
        return 0;
    }


    public double displayRetailPriceForProduct4(double quantitySold) {
        double amount = 4.45;
        while (amount == 4.45) {
            return this.displayRetailPriceForProduct1();
        }
        return 0;
    }

    public double displayRetailPriceForProduct5(double quantitySold) {
        double amount = 6.87;
        while (amount == 6.87) {
            return this.displayRetailPriceForProduct1();
        }
        return 0;
    }
}
