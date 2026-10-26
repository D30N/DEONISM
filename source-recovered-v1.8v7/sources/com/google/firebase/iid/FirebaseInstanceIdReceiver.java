package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends b.k.a.a {

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f2207c = s0.b();

    static final /* synthetic */ void d(boolean z, BroadcastReceiver.PendingResult pendingResult, d.b.a.a.h.h hVar) {
        if (z) {
            pendingResult.setResultCode(hVar.l() ? ((Integer) hVar.h()).intValue() : 500);
        }
        pendingResult.finish();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent2 != null) {
            intent = intent2;
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        c0 j1Var = "google.com/iid".equals(intent.getStringExtra("from")) ? new j1(this.f2207c) : new c(context, this.f2207c);
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        j1Var.a(intent).b(this.f2207c, new d.b.a.a.h.c(zIsOrderedBroadcast, pendingResultGoAsync) { // from class: com.google.firebase.iid.c1
            private final boolean a;

            /* renamed from: b, reason: collision with root package name */
            private final BroadcastReceiver.PendingResult f2219b;

            {
                this.a = zIsOrderedBroadcast;
                this.f2219b = pendingResultGoAsync;
            }

            @Override // d.b.a.a.h.c
            public final void a(d.b.a.a.h.h hVar) {
                FirebaseInstanceIdReceiver.d(this.a, this.f2219b, hVar);
            }
        });
    }
}
