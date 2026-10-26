package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import d.b.b.c;
import d.b.b.j.g;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements h {
    @Override // com.google.firebase.components.h
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<d<?>> getComponents() {
        d.b bVarA = d.a(com.google.firebase.analytics.a.a.class);
        bVarA.b(n.e(c.class));
        bVarA.b(n.e(Context.class));
        bVarA.b(n.e(d.b.b.f.d.class));
        bVarA.f(a.a);
        bVarA.e();
        return Arrays.asList(bVarA.d(), g.a("fire-analytics", "17.4.3"));
    }
}
