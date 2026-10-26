package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import d.b.a.a.e.e.cd;
import d.b.a.a.e.e.ed;
import d.b.a.a.e.e.ya;
import java.util.Map;
import org.json.JSONException;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends cd {
    d5 a = null;

    /* renamed from: b, reason: collision with root package name */
    private Map<Integer, h6> f1609b = new b.d.a();

    class a implements h6 {
        private d.b.a.a.e.e.b a;

        a(d.b.a.a.e.e.b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.gms.measurement.internal.h6
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.v(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.m().J().b("Event listener threw exception", e);
            }
        }
    }

    class b implements i6 {
        private d.b.a.a.e.e.b a;

        b(d.b.a.a.e.e.b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.gms.measurement.internal.i6
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.v(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.m().J().b("Event interceptor threw exception", e);
            }
        }
    }

    private final void g() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void h(ed edVar, String str) {
        this.a.G().R(edVar, str);
    }

    @Override // d.b.a.a.e.e.dd
    public void beginAdUnitExposure(String str, long j) {
        g();
        this.a.S().A(str, j);
    }

    @Override // d.b.a.a.e.e.dd
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        g();
        this.a.F().u0(str, str2, bundle);
    }

    @Override // d.b.a.a.e.e.dd
    public void endAdUnitExposure(String str, long j) {
        g();
        this.a.S().E(str, j);
    }

    @Override // d.b.a.a.e.e.dd
    public void generateEventId(ed edVar) {
        g();
        this.a.G().P(edVar, this.a.G().E0());
    }

    @Override // d.b.a.a.e.e.dd
    public void getAppInstanceId(ed edVar) {
        g();
        this.a.j().z(new g6(this, edVar));
    }

    @Override // d.b.a.a.e.e.dd
    public void getCachedAppInstanceId(ed edVar) {
        g();
        h(edVar, this.a.F().e0());
    }

    @Override // d.b.a.a.e.e.dd
    public void getConditionalUserProperties(String str, String str2, ed edVar) {
        g();
        this.a.j().z(new da(this, edVar, str, str2));
    }

    @Override // d.b.a.a.e.e.dd
    public void getCurrentScreenClass(ed edVar) {
        g();
        h(edVar, this.a.F().h0());
    }

    @Override // d.b.a.a.e.e.dd
    public void getCurrentScreenName(ed edVar) {
        g();
        h(edVar, this.a.F().g0());
    }

    @Override // d.b.a.a.e.e.dd
    public void getGmpAppId(ed edVar) {
        g();
        h(edVar, this.a.F().i0());
    }

    @Override // d.b.a.a.e.e.dd
    public void getMaxUserProperties(String str, ed edVar) {
        g();
        this.a.F();
        com.google.android.gms.common.internal.q.g(str);
        this.a.G().O(edVar, 25);
    }

    @Override // d.b.a.a.e.e.dd
    public void getTestFlag(ed edVar, int i) {
        g();
        if (i == 0) {
            this.a.G().R(edVar, this.a.F().a0());
            return;
        }
        if (i == 1) {
            this.a.G().P(edVar, this.a.F().b0().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.a.G().O(edVar, this.a.F().c0().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.a.G().T(edVar, this.a.F().Z().booleanValue());
                return;
            }
        }
        z9 z9VarG = this.a.G();
        double dDoubleValue = this.a.F().d0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            z9VarG.a.m().J().b("Error returning double value to wrapper", e);
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void getUserProperties(String str, String str2, boolean z, ed edVar) {
        g();
        this.a.j().z(new g7(this, edVar, str, str2, z));
    }

    @Override // d.b.a.a.e.e.dd
    public void initForTests(Map map) {
        g();
    }

    @Override // d.b.a.a.e.e.dd
    public void initialize(d.b.a.a.d.a aVar, d.b.a.a.e.e.e eVar, long j) {
        Context context = (Context) d.b.a.a.d.b.h(aVar);
        d5 d5Var = this.a;
        if (d5Var == null) {
            this.a = d5.a(context, eVar, Long.valueOf(j));
        } else {
            d5Var.m().J().a("Attempting to initialize multiple times");
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void isDataCollectionEnabled(ed edVar) {
        g();
        this.a.j().z(new h9(this, edVar));
    }

    @Override // d.b.a.a.e.e.dd
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        g();
        this.a.F().S(str, str2, bundle, z, z2, j);
    }

    @Override // d.b.a.a.e.e.dd
    public void logEventAndBundle(String str, String str2, Bundle bundle, ed edVar, long j) {
        g();
        com.google.android.gms.common.internal.q.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.a.j().z(new g8(this, edVar, new p(str2, new o(bundle), "app", j), str));
    }

    @Override // d.b.a.a.e.e.dd
    public void logHealthData(int i, String str, d.b.a.a.d.a aVar, d.b.a.a.d.a aVar2, d.b.a.a.d.a aVar3) {
        g();
        this.a.m().B(i, true, false, str, aVar == null ? null : d.b.a.a.d.b.h(aVar), aVar2 == null ? null : d.b.a.a.d.b.h(aVar2), aVar3 != null ? d.b.a.a.d.b.h(aVar3) : null);
    }

    @Override // d.b.a.a.e.e.dd
    public void onActivityCreated(d.b.a.a.d.a aVar, Bundle bundle, long j) {
        g();
        e7 e7Var = this.a.F().f1744c;
        if (e7Var != null) {
            this.a.F().Y();
            e7Var.onActivityCreated((Activity) d.b.a.a.d.b.h(aVar), bundle);
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void onActivityDestroyed(d.b.a.a.d.a aVar, long j) {
        g();
        e7 e7Var = this.a.F().f1744c;
        if (e7Var != null) {
            this.a.F().Y();
            e7Var.onActivityDestroyed((Activity) d.b.a.a.d.b.h(aVar));
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void onActivityPaused(d.b.a.a.d.a aVar, long j) {
        g();
        e7 e7Var = this.a.F().f1744c;
        if (e7Var != null) {
            this.a.F().Y();
            e7Var.onActivityPaused((Activity) d.b.a.a.d.b.h(aVar));
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void onActivityResumed(d.b.a.a.d.a aVar, long j) {
        g();
        e7 e7Var = this.a.F().f1744c;
        if (e7Var != null) {
            this.a.F().Y();
            e7Var.onActivityResumed((Activity) d.b.a.a.d.b.h(aVar));
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void onActivitySaveInstanceState(d.b.a.a.d.a aVar, ed edVar, long j) {
        g();
        e7 e7Var = this.a.F().f1744c;
        Bundle bundle = new Bundle();
        if (e7Var != null) {
            this.a.F().Y();
            e7Var.onActivitySaveInstanceState((Activity) d.b.a.a.d.b.h(aVar), bundle);
        }
        try {
            edVar.f(bundle);
        } catch (RemoteException e) {
            this.a.m().J().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void onActivityStarted(d.b.a.a.d.a aVar, long j) {
        g();
        e7 e7Var = this.a.F().f1744c;
        if (e7Var != null) {
            this.a.F().Y();
            e7Var.onActivityStarted((Activity) d.b.a.a.d.b.h(aVar));
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void onActivityStopped(d.b.a.a.d.a aVar, long j) {
        g();
        e7 e7Var = this.a.F().f1744c;
        if (e7Var != null) {
            this.a.F().Y();
            e7Var.onActivityStopped((Activity) d.b.a.a.d.b.h(aVar));
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void performAction(Bundle bundle, ed edVar, long j) {
        g();
        edVar.f(null);
    }

    @Override // d.b.a.a.e.e.dd
    public void registerOnMeasurementEventListener(d.b.a.a.e.e.b bVar) {
        g();
        h6 aVar = this.f1609b.get(Integer.valueOf(bVar.a()));
        if (aVar == null) {
            aVar = new a(bVar);
            this.f1609b.put(Integer.valueOf(bVar.a()), aVar);
        }
        this.a.F().I(aVar);
    }

    @Override // d.b.a.a.e.e.dd
    public void resetAnalyticsData(long j) {
        g();
        j6 j6VarF = this.a.F();
        j6VarF.N(null);
        j6VarF.j().z(new r6(j6VarF, j));
    }

    @Override // d.b.a.a.e.e.dd
    public void setConditionalUserProperty(Bundle bundle, long j) {
        g();
        if (bundle == null) {
            this.a.m().G().a("Conditional user property must not be null");
        } else {
            this.a.F().H(bundle, j);
        }
    }

    @Override // d.b.a.a.e.e.dd
    public void setCurrentScreen(d.b.a.a.d.a aVar, String str, String str2, long j) {
        g();
        this.a.O().J((Activity) d.b.a.a.d.b.h(aVar), str, str2);
    }

    @Override // d.b.a.a.e.e.dd
    public void setDataCollectionEnabled(boolean z) {
        g();
        j6 j6VarF = this.a.F();
        j6VarF.y();
        j6VarF.a();
        j6VarF.j().z(new d7(j6VarF, z));
    }

    @Override // d.b.a.a.e.e.dd
    public void setDefaultEventParameters(Bundle bundle) {
        g();
        final j6 j6VarF = this.a.F();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        j6VarF.j().z(new Runnable(j6VarF, bundle2) { // from class: com.google.android.gms.measurement.internal.m6

            /* renamed from: b, reason: collision with root package name */
            private final j6 f1792b;

            /* renamed from: c, reason: collision with root package name */
            private final Bundle f1793c;

            {
                this.f1792b = j6VarF;
                this.f1793c = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                j6 j6Var = this.f1792b;
                Bundle bundle3 = this.f1793c;
                if (ya.b() && j6Var.n().t(r.N0)) {
                    if (bundle3 == null) {
                        j6Var.l().C.b(new Bundle());
                        return;
                    }
                    Bundle bundleA = j6Var.l().C.a();
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            j6Var.g();
                            if (z9.c0(obj)) {
                                j6Var.g().J(27, null, null, 0);
                            }
                            j6Var.m().L().c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (z9.C0(str)) {
                            j6Var.m().L().b("Invalid default event parameter name. Name", str);
                        } else if (obj == null) {
                            bundleA.remove(str);
                        } else if (j6Var.g().h0("param", str, 100, obj)) {
                            j6Var.g().N(bundleA, str, obj);
                        }
                    }
                    j6Var.g();
                    if (z9.a0(bundleA, j6Var.n().A())) {
                        j6Var.g().J(26, null, null, 0);
                        j6Var.m().L().a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    j6Var.l().C.b(bundleA);
                    j6Var.s().G(bundleA);
                }
            }
        });
    }

    @Override // d.b.a.a.e.e.dd
    public void setEventInterceptor(d.b.a.a.e.e.b bVar) {
        g();
        j6 j6VarF = this.a.F();
        b bVar2 = new b(bVar);
        j6VarF.a();
        j6VarF.y();
        j6VarF.j().z(new t6(j6VarF, bVar2));
    }

    @Override // d.b.a.a.e.e.dd
    public void setInstanceIdProvider(d.b.a.a.e.e.c cVar) {
        g();
    }

    @Override // d.b.a.a.e.e.dd
    public void setMeasurementEnabled(boolean z, long j) {
        g();
        this.a.F().X(z);
    }

    @Override // d.b.a.a.e.e.dd
    public void setMinimumSessionDuration(long j) {
        g();
        j6 j6VarF = this.a.F();
        j6VarF.a();
        j6VarF.j().z(new f7(j6VarF, j));
    }

    @Override // d.b.a.a.e.e.dd
    public void setSessionTimeoutDuration(long j) {
        g();
        j6 j6VarF = this.a.F();
        j6VarF.a();
        j6VarF.j().z(new n6(j6VarF, j));
    }

    @Override // d.b.a.a.e.e.dd
    public void setUserId(String str, long j) {
        g();
        this.a.F().V(null, "_id", str, true, j);
    }

    @Override // d.b.a.a.e.e.dd
    public void setUserProperty(String str, String str2, d.b.a.a.d.a aVar, boolean z, long j) {
        g();
        this.a.F().V(str, str2, d.b.a.a.d.b.h(aVar), z, j);
    }

    @Override // d.b.a.a.e.e.dd
    public void unregisterOnMeasurementEventListener(d.b.a.a.e.e.b bVar) {
        g();
        h6 h6VarRemove = this.f1609b.remove(Integer.valueOf(bVar.a()));
        if (h6VarRemove == null) {
            h6VarRemove = new a(bVar);
        }
        this.a.F().o0(h6VarRemove);
    }
}
