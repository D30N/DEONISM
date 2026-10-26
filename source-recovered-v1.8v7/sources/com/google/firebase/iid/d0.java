package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class d0 extends BroadcastReceiver {

    @Nullable
    private e0 a;

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    public final void a() {
        if (FirebaseInstanceId.v()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e0 e0Var = this.a;
        if (e0Var != null && e0Var.b()) {
            if (FirebaseInstanceId.v()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.n(this.a, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
