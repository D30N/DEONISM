package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class w extends e {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Intent f1578b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Activity f1579c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f1580d;

    w(Intent intent, Activity activity, int i) {
        this.f1578b = intent;
        this.f1579c = activity;
        this.f1580d = i;
    }

    @Override // com.google.android.gms.common.internal.e
    public final void b() {
        Intent intent = this.f1578b;
        if (intent != null) {
            this.f1579c.startActivityForResult(intent, this.f1580d);
        }
    }
}
