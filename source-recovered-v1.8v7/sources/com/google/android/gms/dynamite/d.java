package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0067b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i;
        DynamiteModule.b.C0067b c0067b = new DynamiteModule.b.C0067b();
        c0067b.a = aVar.a(context, str);
        int iB = aVar.b(context, str, true);
        c0067b.f1601b = iB;
        if (c0067b.a == 0 && iB == 0) {
            i = 0;
        } else {
            if (c0067b.f1601b >= c0067b.a) {
                c0067b.f1602c = 1;
                return c0067b;
            }
            i = -1;
        }
        c0067b.f1602c = i;
        return c0067b;
    }
}
