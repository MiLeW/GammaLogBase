package se.wigle.mikael;



import org.json.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mikae_000 on 2014-11-20.
 */
public class Treatment {
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
	private List<Dose> lDoses = new ArrayList<Dose>();
}
