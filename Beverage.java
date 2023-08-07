public abstract class Beverage {
    private String bevName;
    private Size size;
    private double basePrice;

    public Beverage(String bevName, Size size, double basePrice) {
        this.bevName = bevName;
        this.size = size;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract Type getType();

    public String getBevName() {
        return bevName;
    }

    public Size getSize() {
        return size;
    }

    public double addSizePrice(double sizePrice) {
        if (size == Size.SMALL) {
            return basePrice;
        } else {
            return basePrice + sizePrice;
        }
    }

    @Override
    public String toString() {
        return bevName + ", " + size;
    }

    @Override
    public boolean equals(Object anotherBev) {
        if (this == anotherBev) {
            return true;
        }
        if (anotherBev == null || getClass() != anotherBev.getClass()) {
            return false;
        }
        Beverage beverage = (Beverage) anotherBev;
        return bevName.equals(beverage.bevName) && size == beverage.size;
    }

    public abstract double calcPrice();
}
