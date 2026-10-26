package com.facebook.drawee.b.a.h;

import com.facebook.drawee.b.a.i.b;
import com.facebook.drawee.b.a.i.d;

/* loaded from: classes.dex */
public class a implements b {
    private int a = 1;

    @Override // com.facebook.drawee.b.a.i.b
    public void a(String str, int i, boolean z, String str2) {
        this.a = i;
    }

    public String b() {
        return d.b(this.a);
    }
}
