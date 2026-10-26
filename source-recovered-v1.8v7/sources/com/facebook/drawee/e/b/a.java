package com.facebook.drawee.e.b;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.d.c;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private long f1185b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f1186c = -1;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private b f1187d;

    public a(@Nullable b bVar) {
        this.f1187d = bVar;
    }

    @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
    public void b(String str, Object obj) {
        this.f1185b = System.currentTimeMillis();
    }

    @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
    public void c(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f1186c = jCurrentTimeMillis;
        b bVar = this.f1187d;
        if (bVar != null) {
            bVar.a(jCurrentTimeMillis - this.f1185b);
        }
    }
}
