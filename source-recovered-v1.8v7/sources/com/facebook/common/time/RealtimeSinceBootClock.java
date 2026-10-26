package com.facebook.common.time;

import android.os.SystemClock;
import d.a.b.d.d;

@d
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements b {
    private static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // com.facebook.common.time.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
