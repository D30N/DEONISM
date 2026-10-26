package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class j {

    /* renamed from: d, reason: collision with root package name */
    private static j f71d;
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f72b;

    /* renamed from: c, reason: collision with root package name */
    private final a f73c = new a();

    private static class a {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        long f74b;

        /* renamed from: c, reason: collision with root package name */
        long f75c;

        /* renamed from: d, reason: collision with root package name */
        long f76d;
        long e;
        long f;

        a() {
        }
    }

    j(Context context, LocationManager locationManager) {
        this.a = context;
        this.f72b = locationManager;
    }

    static j a(Context context) {
        if (f71d == null) {
            Context applicationContext = context.getApplicationContext();
            f71d = new j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f71d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = b.g.d.b.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = b.g.d.b.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f72b.isProviderEnabled(str)) {
                return this.f72b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    private boolean e() {
        return this.f73c.f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.f73c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i iVarB = i.b();
        iVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = iVarB.a;
        iVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = iVarB.f70c == 1;
        long j3 = iVarB.f69b;
        long j4 = iVarB.a;
        boolean z2 = z;
        iVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = iVarB.f69b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            j = (jCurrentTimeMillis > j4 ? 0 + j5 : jCurrentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.a = z2;
        aVar.f74b = j2;
        aVar.f75c = j3;
        aVar.f76d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    boolean d() {
        a aVar = this.f73c;
        if (e()) {
            return aVar.a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
