package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import d.b.a.a.a.a.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* loaded from: classes.dex */
final class m4 extends b6 {
    static final Pair<String, Long> D = new Pair<>("", 0L);
    public final s4 A;
    public final q4 B;
    public final r4 C;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f1787c;

    /* renamed from: d, reason: collision with root package name */
    public t4 f1788d;
    public final q4 e;
    public final q4 f;
    public final q4 g;
    public final q4 h;
    public final q4 i;
    public final q4 j;
    public final q4 k;
    public final s4 l;
    private String m;
    private boolean n;
    private long o;
    public final q4 p;
    public final q4 q;
    public final o4 r;
    public final s4 s;
    public final o4 t;
    public final q4 u;
    public boolean v;
    public o4 w;
    public o4 x;
    public q4 y;
    public final s4 z;

    m4(d5 d5Var) {
        super(d5Var);
        this.e = new q4(this, "last_upload", 0L);
        this.f = new q4(this, "last_upload_attempt", 0L);
        this.g = new q4(this, "backoff", 0L);
        this.h = new q4(this, "last_delete_stale", 0L);
        this.p = new q4(this, "time_before_start", 10000L);
        this.q = new q4(this, "session_timeout", 1800000L);
        this.r = new o4(this, "start_new_session", true);
        this.u = new q4(this, "last_pause_time", 0L);
        this.s = new s4(this, "non_personalized_ads", null);
        this.t = new o4(this, "allow_remote_dynamite", false);
        this.i = new q4(this, "midnight_offset", 0L);
        this.j = new q4(this, "first_open_time", 0L);
        this.k = new q4(this, "app_install_time", 0L);
        this.l = new s4(this, "app_instance_id", null);
        this.w = new o4(this, "app_backgrounded", false);
        this.x = new o4(this, "deep_link_retrieval_complete", false);
        this.y = new q4(this, "deep_link_retrieval_attempts", 0L);
        this.z = new s4(this, "firebase_feature_rollouts", null);
        this.A = new s4(this, "deferred_attribution_cache", null);
        this.B = new q4(this, "deferred_attribution_cache_timestamp", 0L);
        this.C = new r4(this, "default_event_parameters", null);
    }

    final void A(boolean z) {
        c();
        m().O().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = C().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    final void B(String str) {
        c();
        SharedPreferences.Editor editorEdit = C().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    protected final SharedPreferences C() {
        c();
        p();
        return this.f1787c;
    }

    final String D() {
        c();
        return C().getString("gmp_app_id", null);
    }

    final String E() {
        c();
        return C().getString("admob_app_id", null);
    }

    final Boolean F() {
        c();
        if (C().contains("use_service")) {
            return Boolean.valueOf(C().getBoolean("use_service", false));
        }
        return null;
    }

    final void G() {
        c();
        Boolean boolH = H();
        SharedPreferences.Editor editorEdit = C().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolH != null) {
            y(boolH.booleanValue());
        }
    }

    final Boolean H() {
        c();
        if (C().contains("measurement_enabled")) {
            return Boolean.valueOf(C().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String I() {
        c();
        String string = C().getString("previous_os_version", null);
        d().p();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = C().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final boolean J() {
        return this.f1787c.contains("deferred_analytics_collection");
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final void o() {
        SharedPreferences sharedPreferences = f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f1787c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.v = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f1787c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f1788d = new t4(this, "health_monitor", Math.max(0L, r.f1867c.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean s() {
        return true;
    }

    final Pair<String, Boolean> u(String str) {
        c();
        long jB = k().b();
        if (this.m != null && jB < this.o) {
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        this.o = jB + n().q(str, r.f1866b);
        d.b.a.a.a.a.a.d(true);
        try {
            a.C0094a c0094aB = d.b.a.a.a.a.a.b(f());
            if (c0094aB != null) {
                this.m = c0094aB.a();
                this.n = c0094aB.b();
            }
            if (this.m == null) {
                this.m = "";
            }
        } catch (Exception e) {
            m().N().b("Unable to get advertising id", e);
            this.m = "";
        }
        d.b.a.a.a.a.a.d(false);
        return new Pair<>(this.m, Boolean.valueOf(this.n));
    }

    final void v(boolean z) {
        c();
        SharedPreferences.Editor editorEdit = C().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    final boolean w(long j) {
        return j - this.q.a() > this.u.a();
    }

    final String x(String str) {
        c();
        String str2 = (String) u(str).first;
        MessageDigest messageDigestJ0 = z9.J0();
        if (messageDigestJ0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestJ0.digest(str2.getBytes())));
    }

    final void y(boolean z) {
        c();
        SharedPreferences.Editor editorEdit = C().edit();
        editorEdit.putBoolean("measurement_enabled", z);
        editorEdit.apply();
    }

    final void z(String str) {
        c();
        SharedPreferences.Editor editorEdit = C().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }
}
