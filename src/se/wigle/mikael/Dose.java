package se.wigle.mikael;

import org.json.*;
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
        String batch = XMLfunctions.makeTag("Brand",mBrand);
        String brand = XMLfunctions.makeTag("Batch",mBatch);
        return XMLfunctions.makeTag("Dose",multiplicity + amount + manufacturer + batch + brand);
    }

    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        json.put("Multiplicity",mMultiplicity);
        JSONObject amount = new JSONObject();
        amount.put("Value",mAmountValue);
        amount.put("Unit",mAmountUnit);
        json.put("Amount",amount);
        json.put("Manufacturer",mManufacturer);
        json.put("Brand",mBrand);
        json.put("Batch",mBatch);
        return json;
    }

    private Integer mMultiplicity;
    private Integer mAmountValue;
    private String mAmountUnit;
    private String mManufacturer;
    private String mBrand;
    private String mBatch;
}
