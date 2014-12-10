package se.wigle.mikael;

import org.json.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Medication treat = new Medication();
        treat.setDate(2014,11,29);
        treat.addDose(new Dose(2,20,"ml","OctaPharma","GammaNorm","ABC123"));
        treat.addDose(new Dose(1,10,"ml","OctaPharma","GammaNorm","DEF456"));
        System.out.print(treat.toXMLString());

        System.out.println();
        JSONObject jsontreat = treat.toJSON();
        String JSONString = jsontreat.toString(2);
        System.out.print(JSONString);

        JSONObject json = new JSONObject(JSONString);
        Medication treat2 = new Medication(json);

        System.out.println();
        System.out.println(treat2.toXMLString());


    }
}
