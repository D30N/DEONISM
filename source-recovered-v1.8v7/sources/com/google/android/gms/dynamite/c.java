package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class c implements DynamiteModule.b {
    c() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0067b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0067b c0067b = new DynamiteModule.b.C0067b();
        int iA = aVar.a(context, str);
        c0067b.a = iA;
        c0067b.f1601b = iA != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        if (c0067b.a == 0 && c0067b.f1601b == 0) {
            c0067b.f1602c = 0;
        } else if (c0067b.a >= c0067b.f1601b) {
            c0067b.f1602c = -1;
        } else {
            c0067b.f1602c = 1;
        }
        return c0067b;
    }
}
