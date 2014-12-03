package se.wigle.mikael;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mikae_000 on 2014-11-20.
 */
public class Treatment {
	public void addDose(Dose newDose) {
		lDoses.add(newDose);
	}

	public String toXMLString(){
		String doses;
		String date = XMLfunctions.makeTag("Date", mDate.toString());
		for (Dose dose : lDoses) {
			doses = doses + toXMLString(dose);
		}
		doses = XMLfunctions.makeTag("Doses",doses);
		return XMLfunctions.makeTag("Treatment",date+doses);
	}


	private Date mDate;
	private List<Dose> lDoses = new ArrayList<Dose>();
}
