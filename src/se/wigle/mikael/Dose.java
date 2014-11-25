package se.wigle.mikael;

/**
 * Created by mikae_000 on 2014-11-20.
 */
public class Dose {
    public Dose() {
    }

    public Dose(Dose newDose) {
    }

    public Dose(Integer multiplicity, Integer amountValue, String amountUnit,
                String manufacturer, String brand, String batch) {
        mMultiplicity   = multiplicity;
        mAmountValue    = amountValue;
        mAmountUnit     = amountUnit;
        mManufacturer   = manufacturer;
        mBrand          = brand;
        mBatch          = batch;
    }
    public String toXmlString(){
        String multiplicity = XMLfunctions.makeTag("Multiplicity",mMultiplicity.toString());
        String amount = XMLfunctions.makeTag("Amount",XMLfunctions.makeTag("Value",mAmountValue.toString()) +
                XMLfunctions.makeTag("Unit",mAmountUnit));
        String manufacturer = XMLfunctions.makeTag("Manufacturer",mManufacturer);
        String brand = XMLfunctions.makeTag("Batch",mBatch);
        String batch = XMLfunctions.makeTag("Brand",mBrand);
        return XMLfunctions.makeTag("Dose",multiplicity + amount + manufacturer + brand + batch);
    }

    public Integer getmMultiplicity() {
        return mMultiplicity;
    }

    public void setmMultiplicity(Integer mMultiplicity) {
        this.mMultiplicity = mMultiplicity;
    }

    public Integer getmAmountValue() {
        return mAmountValue;
    }

    public void setmAmountValue(Integer mAmountValue) {
        this.mAmountValue = mAmountValue;
    }

    public String getmAmountUnit() {
        return mAmountUnit;
    }

    public void setmAmountUnit(String mAmountUnit) {
        this.mAmountUnit = mAmountUnit;
    }

    public String getmManufacturer() {
        return mManufacturer;
    }

    public void setmManufacturer(String mManufacturer) {
        this.mManufacturer = mManufacturer;
    }

    public String getmBrand() {
        return mBrand;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public String getmBatch() {
        return mBatch;
    }

    public void setmBatch(String mBatch) {
        this.mBatch = mBatch;
    }

    private Integer mMultiplicity;
    private Integer mAmountValue;
    private String mAmountUnit;
    private String mManufacturer;
    private String mBrand;
    private String mBatch;
}
