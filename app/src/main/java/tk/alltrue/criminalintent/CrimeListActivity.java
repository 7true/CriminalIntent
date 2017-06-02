package tk.alltrue.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ya on 06.01.17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_twopane;
    }
}
