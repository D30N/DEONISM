package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class j {
    private final SparseIntArray a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private d.b.a.a.c.f f1564b;

    public j(d.b.a.a.c.f fVar) {
        q.k(fVar);
        this.f1564b = fVar;
    }

    public void a() {
        this.a.clear();
    }

    public int b(Context context, a.f fVar) {
        q.k(context);
        q.k(fVar);
        int iH = 0;
        if (!fVar.o()) {
            return 0;
        }
        int iQ = fVar.q();
        int i = this.a.get(iQ, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                iH = i;
                break;
            }
            int iKeyAt = this.a.keyAt(i2);
            if (iKeyAt > iQ && this.a.get(iKeyAt) == 0) {
                break;
            }
            i2++;
        }
        if (iH == -1) {
            iH = this.f1564b.h(context, iQ);
        }
        this.a.put(iQ, iH);
        return iH;
    }
}
