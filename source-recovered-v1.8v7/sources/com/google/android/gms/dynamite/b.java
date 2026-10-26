package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class b implements DynamiteModule.b {
    b() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0067b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0067b c0067b = new DynamiteModule.b.C0067b();
        int iA = aVar.a(context, str);
        c0067b.a = iA;
        if (iA != 0) {
            c0067b.f1602c = -1;
        } else {
            int iB = aVar.b(context, str, true);
            c0067b.f1601b = iB;
            if (iB != 0) {
                c0067b.f1602c = 1;
            }
        }
        return c0067b;
    }
}
