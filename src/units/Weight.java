package units;

public enum Weight {

    GALLON(128.0 * 1.04 * 28.3495), // 1 fl oz = 1.04 oz
    GRAM(1.0),
    KILOGRAM(1000.0),
    OUNCE(28.3495),
    POUND(453.592),

    ;

    // Use grams as the default unit of time
    double grams;

    Weight(double g) {
        this.grams = g;
    }

    public double getGrams() {
        return this.grams;
    }

}
