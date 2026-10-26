package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.measurement.internal.d5;
import com.google.android.gms.measurement.internal.d6;
import com.google.android.gms.measurement.internal.h7;
import d.b.a.a.e.e.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: d, reason: collision with root package name */
    private static volatile AppMeasurement f1603d;
    private final d5 a;

    /* renamed from: b, reason: collision with root package name */
    private final h7 f1604b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1605c;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            q.k(bundle);
            this.mAppId = (String) d6.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) d6.a(bundle, "origin", String.class, null);
            this.mName = (String) d6.a(bundle, "name", String.class, null);
            this.mValue = d6.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) d6.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) d6.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) d6.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) d6.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) d6.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) d6.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) d6.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) d6.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) d6.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) d6.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) d6.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) d6.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }

        final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                d6.b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    private AppMeasurement(d5 d5Var) {
        q.k(d5Var);
        this.a = d5Var;
        this.f1604b = null;
        this.f1605c = false;
    }

    private AppMeasurement(h7 h7Var) {
        q.k(h7Var);
        this.f1604b = h7Var;
        this.a = null;
        this.f1605c = true;
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f1603d == null) {
            synchronized (AppMeasurement.class) {
                if (f1603d == null) {
                    h7 h7VarB = b(context, null);
                    if (h7VarB != null) {
                        f1603d = new AppMeasurement(h7VarB);
                    } else {
                        f1603d = new AppMeasurement(d5.a(context, new e(0L, 0L, true, null, null, null, null), null));
                    }
                }
            }
        }
        return f1603d;
    }

    private static h7 b(Context context, Bundle bundle) {
        try {
            return (h7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f1605c) {
            this.f1604b.g(str);
        } else {
            this.a.S().A(str, this.a.k().b());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f1605c) {
            this.f1604b.j(str, str2, bundle);
        } else {
            this.a.F().u0(str, str2, bundle);
        }
    }

    @Keep
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f1605c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().W(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f1605c) {
            this.f1604b.k(str);
        } else {
            this.a.S().E(str, this.a.k().b());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f1605c ? this.f1604b.e() : this.a.G().E0();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f1605c ? this.f1604b.c() : this.a.F().e0();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listI = this.f1605c ? this.f1604b.i(str, str2) : this.a.F().C(str, str2);
        ArrayList arrayList = new ArrayList(listI == null ? 0 : listI.size());
        Iterator<Bundle> it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f1605c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().D(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f1605c ? this.f1604b.b() : this.a.F().h0();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f1605c ? this.f1604b.a() : this.a.F().g0();
    }

    @Keep
    public String getGmpAppId() {
        return this.f1605c ? this.f1604b.d() : this.a.F().i0();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f1605c) {
            return this.f1604b.h(str);
        }
        this.a.F();
        q.g(str);
        return 25;
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f1605c ? this.f1604b.l(str, str2, z) : this.a.F().F(str, str2, z);
    }

    @Keep
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f1605c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().E(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f1605c) {
            this.f1604b.m(str, str2, bundle);
        } else {
            this.a.F().R(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        q.k(conditionalUserProperty);
        if (this.f1605c) {
            this.f1604b.f(conditionalUserProperty.a());
        } else {
            this.a.F().G(conditionalUserProperty.a());
        }
    }

    @Keep
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        q.k(conditionalUserProperty);
        if (this.f1605c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().m0(conditionalUserProperty.a());
        throw null;
    }
}
