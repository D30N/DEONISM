package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1273b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f1274c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1275d;
    public final int e;

    public f0(int i, int i2, @Nullable SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public f0(int i, int i2, @Nullable SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        d.a.b.d.i.i(i >= 0 && i2 >= i);
        this.f1273b = i;
        this.a = i2;
        this.f1274c = sparseIntArray;
        this.e = i5;
    }
}
