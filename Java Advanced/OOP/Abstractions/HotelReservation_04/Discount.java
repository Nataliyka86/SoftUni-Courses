package OOP.Abstractions.HotelReservation_04;

public enum Discount {

    VIP(0.2), SecondVisit(0.1), None(0);
    private double discountPercent;

    Discount(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }
}
