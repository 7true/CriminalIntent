package tk.alltrue.criminalintent;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;
import java.util.UUID;

import tk.alltrue.criminalintent.database.CrimeBaseHelper;
import tk.alltrue.criminalintent.database.CrimeDbSchema;
import tk.alltrue.criminalintent.database.CrimeDbSchema.CrimeTable;

/**
 * Created by ya on 06.01.17.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static CrimeLab get (Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        //mAppContext = appContext;
        mContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(mContext)
                .getWritableDatabase();
        //mCrimes = new ArrayList<>();
    }

    public void addCrime(Crime c) {
        //mCrimes.add(c);
    }

    public void deleteCrime(UUID crimeId) {
        Crime crime = getCrime(crimeId);
        mCrimes.remove(crime);
    }
    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        /*for (Crime crime: mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }*/
        return null;
     }

     public void updateCrime(Crime crime) {
         String uuidstring = crime.getId().toString();
         ContentValues values = getContentValues(crime);

         mDatabase.update(CrimeDbSchema.CrimeTable.NAME, values,
                 CrimeTable.Cols.UUID + " = ?",
                 new String[]{uuidstring});
     }

     private static ContentValues getContentValues(Crime crime) {
         ContentValues values = new ContentValues();
         values.put(CrimeTable.Cols.DATE, crime.getDate().getTime());
         values.put(CrimeTable.Cols.SOLVED, crime.isSolved() ? 1 : 0);
        return values;
     }

     private Cursor queryCrimes(String whereClause, String[] whereArgs) {
         Cursor cursor = mDatabase.query(
                 CrimeTable.NAME,
                 null,
                 whereClause,
                 whereArgs,
                 null,
                 null,
                 null
         );
         return cursor;
     }
}
