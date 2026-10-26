package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b {

    @Nullable
    private final Pair<Integer, Integer> a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ColorSpace f1433b;

    public b(int i, int i2, @Nullable ColorSpace colorSpace) {
        this.a = (i == -1 || i2 == -1) ? null : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.f1433b = colorSpace;
    }

    @Nullable
    public ColorSpace a() {
        return this.f1433b;
    }

    @Nullable
    public Pair<Integer, Integer> b() {
        return this.a;
    }
}
