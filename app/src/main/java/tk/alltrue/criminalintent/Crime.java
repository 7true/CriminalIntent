package tk.alltrue.criminalintent;


import android.text.format.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ya on 29.11.16.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String strCurrentDate;


    public void setStrCurrentDate(String strCurrentDate) {
        this.strCurrentDate = strCurrentDate;
    }

    public String getStrCurrentDate() {
        return strCurrentDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("EEE, MMM dd, yyyy");
        strCurrentDate = df.format(mDate);

    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        mTitle = Title;
    }
}
