package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import b.k.a.a;
import com.google.android.gms.measurement.internal.w4;
import com.google.android.gms.measurement.internal.z4;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements z4 {

    /* renamed from: c, reason: collision with root package name */
    private w4 f1607c;

    @Override // com.google.android.gms.measurement.internal.z4
    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f1607c == null) {
            this.f1607c = new w4(this);
        }
        this.f1607c.a(context, intent);
    }
}
