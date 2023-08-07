public class Smoothie extends Beverage {
    private int numOfFruits;
    private boolean addProtein;

    public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
        super(bevName, size, calculateBasePrice(numOfFruits, addProtein));
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

    public int getNumOfFruits() {
        return numOfFruits;
    }

    public boolean getAddProtein() {
        return addProtein;
    }

    private static double calculateBasePrice(int numOfFruits, boolean addProtein) {
        double basePrice = 3.0; // Base price of smoothie without extras
        basePrice += numOfFruits * 0.5; // Additional cost per fruit
        if (addProtein) {
            basePrice += 1.0; // Additional cost for protein
        }
        return basePrice;
    }
    @Override
    public Type getType() {
        return Type.SMOOTHIE; // Replace with the appropriate value from your Type enum
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
                ", Number of Fruits: " + numOfFruits +
                ", Add Protein: " + (addProtein ? "Yes" : "No") +
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
        Smoothie smoothie = (Smoothie) anotherBev;
        return super.equals(anotherBev) && numOfFruits == smoothie.numOfFruits && addProtein == smoothie.addProtein;
    }
}
