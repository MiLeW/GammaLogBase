package se.wigle.mikael;



import org.json.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mikae_000 on 2014-11-20.
 */
public class Medication {

	public Medication()
	{
		lDoses = new ArrayList<Dose>();
	}

	public Medication(JSONObject json){
		mDate = new mediLogDate(json.getJSONObject("Date"));
		lDoses = new ArrayList<Dose>();
		JSONArray jsonDoses = json.getJSONArray("Doses");
		for (int i = 0; i < jsonDoses.length(); i++)
		{
			lDoses.add(new Dose(jsonDoses.getJSONObject(i)));
		}
	}
	public void addDose(Dose newDose) {
		lDoses.add(newDose);
	}

	public String toXMLString(){
		String doses = new String();
		String date =  mDate.toXMLString();
		for (Dose dose : lDoses) {
			doses = doses + dose.toXmlString();
		}
		doses = XMLfunctions.makeTag("Doses",doses);
		return XMLfunctions.makeTag("Treatment",date+doses);
	}

	public JSONObject toJSON(){
		JSONObject json = new JSONObject();
		json.put("Date",mDate.toJSON());
		JSONArray doses = new JSONArray();
		for (Dose dose : lDoses) {
			doses.put(dose.toJSON());
		}
		json.put("Doses",doses);
		return json;
	}

	public void setDate(Integer year, Integer month, Integer day){
		mDate = new mediLogDate(year, month, day);
	}


	private mediLogDate mDate;
	private String mDescription;
	private List<Dose> lDoses;
}
