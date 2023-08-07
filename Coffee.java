public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;

    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        super(bevName, size, calculateBasePrice(extraShot, extraSyrup));
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    public boolean getExtraShot() {
        return extraShot;
    }

    public boolean getExtraSyrup() {
        return extraSyrup;
    }

    private static double calculateBasePrice(boolean extraShot, boolean extraSyrup) {
        double basePrice = 2.0; // Base price of coffee without extras
        if (extraShot) {
            basePrice += 1.0; // Additional cost for extra shot
        }
        if (extraSyrup) {
            basePrice += 0.5; // Additional cost for extra syrup
        }
        return basePrice;
    }

    @Override
    public Type getType() {
        return Type.COFFEE; // Replace with the appropriate value from your Type enum
    }

    @Override
    public double calcPrice() {
        double sizePrice = 0.0;
        switch (getSize()) {
            case MEDIUM:
                sizePrice = 0.5;
                break;
            case LARGE:
                sizePrice = 1.0;
                break;
            default:
                break;
        }
        return addSizePrice(sizePrice);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Extra Shot: " + (extraShot ? "Yes" : "No") +
                ", Extra Syrup: " + (extraSyrup ? "Yes" : "No") +
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
        Coffee coffee = (Coffee) anotherBev;
        return super.equals(anotherBev) && extraShot == coffee.extraShot && extraSyrup == coffee.extraSyrup;
    }

    @Override
    public double addSizePrice(double sizePrice) {
        return super.addSizePrice(sizePrice);
    }
}
