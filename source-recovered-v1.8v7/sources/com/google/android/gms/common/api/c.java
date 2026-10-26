package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.d0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private final b.d.a<d0<?>, d.b.a.a.c.b> f1485b;

    public c(b.d.a<d0<?>, d.b.a.a.c.b> aVar) {
        this.f1485b = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (d0<?> d0Var : this.f1485b.keySet()) {
            d.b.a.a.c.b bVar = this.f1485b.get(d0Var);
            if (bVar.m()) {
                z = false;
            }
            String strA = d0Var.a();
            String strValueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 2 + String.valueOf(strValueOf).length());
            sb.append(strA);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
