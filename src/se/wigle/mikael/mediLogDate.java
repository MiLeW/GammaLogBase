package se.wigle.mikael;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Mikael on 2014-12-03.
 */
public class mediLogDate {
    public mediLogDate(Integer year, Integer month, Integer day) {
        mCalendar = new GregorianCalendar();
        mCalendar.set(year, month, day);
    }

    public mediLogDate(mediLogDate date) {
        mCalendar = new GregorianCalendar();
        mCalendar = date.mCalendar;
    }

    public String toXMLString() {
        String content;
        content = XMLfunctions.makeTag("Year", Integer.toString(mCalendar.get(Calendar.YEAR))) +
                XMLfunctions.makeTag("Month", Integer.toString(mCalendar.get(Calendar.MONTH))) +
                XMLfunctions.makeTag("Day", Integer.toString(mCalendar.get(Calendar.DATE)));
        return XMLfunctions.makeTag("Date", content);
    }

    private Calendar mCalendar;
}

