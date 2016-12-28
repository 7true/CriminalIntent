package tk.alltrue.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ya on 29.11.16.
 */

public class Crime {
    private UUID mId;
    private String mTIitle;
    private Date mDate;
    private boolean mSolved;

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
    }

    public UUID getId() {
        return mId;
    }

    public String getTIitle() {
        return mTIitle;
    }

    public void setTitle(String Title) {
        mTIitle = Title;
    }
}
