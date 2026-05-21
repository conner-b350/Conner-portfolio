public class MarketItem {
    private String name;
    private double price;
    private double volatility;

    public MarketItem(String name, double startPrice, double vol) {
        this.name = name;
        this.price = startPrice;
        this.volatility = vol;
    }

    // STUDENT TASK: Logic for price movement
    public void updatePrice() {
        
        double direction = Math.random() * 2 - 1;
        
        
        double change = direction * volatility * price;
        
        
        price += change; 
        
        if (price < 0.01) {
            price = 0.01;
        }
    }

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
}
