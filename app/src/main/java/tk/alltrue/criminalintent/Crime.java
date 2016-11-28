package tk.alltrue.criminalintent;

import java.util.UUID;

/**
 * Created by ya on 29.11.16.
 */

public class Crime {
    private UUID mId;
    private String mTIitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTIitle() {
        return mTIitle;
    }

    public void setTIitle(String TIitle) {
        mTIitle = TIitle;
    }
}
