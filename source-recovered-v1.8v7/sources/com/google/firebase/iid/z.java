package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class z extends d.b.a.a.e.d.e {
    private final /* synthetic */ w a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(w wVar, Looper looper) {
        super(looper);
        this.a = wVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.d(message);
    }
}
