package bankmanagementsystem;

public enum Currency {
    EGP(1), USD(0.064), EUR(0.054), GBP(0.046), SAR(0.24);
    
    //data field
    private double exchangePrice;
    
    //constructors
    Currency(double exchangePrice) {
        this.exchangePrice = exchangePrice;
    }
    
    //accessors
    public void setExchangePrice(double exchangePrice) {
        this.exchangePrice = exchangePrice;
    }
    
    //mutators
    public double getExchangePrice() {
        return this.exchangePrice;
    }
}