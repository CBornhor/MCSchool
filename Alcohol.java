public class Alcohol extends Beverage {
    private boolean isWeekend;

    public Alcohol(String bevName, Size size, boolean isWeekend) {
        super(bevName, size, calculateBasePrice(isWeekend));
        this.isWeekend = isWeekend;
    }

    private static double calculateBasePrice(boolean isWeekend) {
        double basePrice = 5.0; // Base price of alcohol
        if (isWeekend) {
            basePrice += 2.0; // Additional cost for weekend
        }
        return basePrice;
    }
    @Override
    public Type getType() {
        return Type.ALCOHOL; // Replace with the appropriate value from your Type enum
    }

    @Override
    public double calcPrice() {
        return getBasePrice();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Weekend: " + (isWeekend ? "Yes" : "No") +
                ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object anotherBev) {
        if (this == anotherBev) {
            return true;
        }
        if (anotherBev == null || getClass() != anotherBev.getClass()) {
            return false;
        }
        Alcohol alcohol = (Alcohol) anotherBev;
        return super.equals(anotherBev) && isWeekend == alcohol.isWeekend();
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

