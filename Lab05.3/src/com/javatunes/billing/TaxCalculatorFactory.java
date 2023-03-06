package com.javatunes.billing;

public class TaxCalculatorFactory {

    private TaxCalculatorFactory() {
    }
    //
    //implement a cache of TaxCalculator objects, such that we
    //return a previously created one, if one is in there.
    //if not, we create and return a new one.
    // Hint: can use a Map<Location,TaxCalculator> for the cache

    // assertSame to test

    // Location      |     TaxCalculator
    // -------------------------------
    // EUROPE        |     EuropeTax object
    //
    //



    public static TaxCalculator getTaxCalculator(Location location) {
        TaxCalculator calc = null;
        switch (location) {
            case ONLINE:
                calc = new OnlineTax();
                break;
            case USA:
                calc = new USATax();
                break;
            case EUROPE:
                calc = new EuropeTax();

        }
        return calc;
    }
}
