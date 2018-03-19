package com.wmstein.transektcount.database;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/****************************************************
 * Based on Project.java by milo on 05/05/2014.
 * Adopted for TransektCount by wmstein on 18.02.2016
 */
public class Section
{
    public int id;
    long created_at;
    public String name;
    public String notes;

    //Get Date from DB table sections field created_at
    public String getDate()
    {
        Date date = new Date(created_at);
        DateFormat df = SimpleDateFormat.getDateInstance();
        return df.format(date);
    }

    public Long DatNum()
    {
        return created_at;
    }

}
