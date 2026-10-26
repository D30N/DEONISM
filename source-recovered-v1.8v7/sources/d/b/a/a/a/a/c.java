package d.b.a.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import d.b.a.a.c.i;

/* loaded from: classes.dex */
public final class c {
    private SharedPreferences a;

    public c(Context context) {
        try {
            Context contextC = i.c(context);
            this.a = contextC == null ? null : contextC.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.a = null;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.a == null) {
                return false;
            }
            return this.a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    final float b(String str, float f) {
        try {
            if (this.a == null) {
                return 0.0f;
            }
            return this.a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    final String c(String str, String str2) {
        try {
            return this.a == null ? str2 : this.a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
