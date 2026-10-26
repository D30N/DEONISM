package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes.dex */
public final class ha {
    private final d5 a;

    public ha(d5 d5Var) {
        this.a = d5Var;
    }

    private final boolean d() {
        return e() && this.a.k().a() - this.a.A().B.a() > this.a.x().q(null, r.S0);
    }

    private final boolean e() {
        return this.a.A().B.a() > 0;
    }

    final void a() {
        this.a.j().c();
        if (e()) {
            if (d()) {
                this.a.A().A.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.F().R("auto", "_cmpx", bundle);
            } else {
                String strA = this.a.A().A.a();
                if (TextUtils.isEmpty(strA)) {
                    this.a.m().H().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.a.A().B.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    this.a.F().R((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.a.A().A.b(null);
            }
            this.a.A().B.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        this.a.j().c();
        if (this.a.p()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.a.A().A.b(string);
        this.a.A().B.b(this.a.k().a());
    }

    final void c() {
        if (e() && d()) {
            this.a.A().A.b(null);
        }
    }
}
