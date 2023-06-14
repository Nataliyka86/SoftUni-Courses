package OOP.Abstractions.HotelReservation_044;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }
    public double price(){
        double price = this.pricePerDay * this.numberOfDays * this.season.getValue();
        return price - (price * this.discountType.getDiscount());
    }
}
