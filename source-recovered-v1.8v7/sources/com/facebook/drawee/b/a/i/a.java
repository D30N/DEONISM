package com.facebook.drawee.b.a.i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a implements b {
    private final List<b> a;

    public a(b... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        this.a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }

    @Override // com.facebook.drawee.b.a.i.b
    public synchronized void a(String str, int i, boolean z, String str2) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.a.get(i2);
            if (bVar != null) {
                try {
                    bVar.a(str, i, z, str2);
                } catch (Exception e) {
                    d.a.b.e.a.i("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }

    public synchronized void b(b bVar) {
        this.a.add(bVar);
    }

    public synchronized void c(b bVar) {
        this.a.remove(bVar);
    }
}
