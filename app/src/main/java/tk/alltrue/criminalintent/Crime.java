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
    private String mPhoneNumber;
    private String mSuspect;

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
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
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

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getPhotoFilename() {
        return "IMG " + getId().toString() + ".jpg";
    }
}
