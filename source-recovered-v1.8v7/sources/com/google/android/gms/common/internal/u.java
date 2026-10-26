package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class u {
    private final Resources a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1577b;

    public u(Context context) {
        q.k(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.f1577b = resources.getResourcePackageName(d.b.a.a.c.k.common_google_play_services_unknown_issue);
    }

    @Nullable
    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.f1577b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
