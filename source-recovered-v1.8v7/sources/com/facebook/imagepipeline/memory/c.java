package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class c {

    @GuardedBy("this")
    private int a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private long f1259b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1260c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1261d;
    private final d.a.b.h.h<Bitmap> e;

    class a implements d.a.b.h.h<Bitmap> {
        a() {
        }

        @Override // d.a.b.h.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            try {
                c.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public c(int i, int i2) {
        d.a.b.d.i.b(i > 0);
        d.a.b.d.i.b(i2 > 0);
        this.f1260c = i;
        this.f1261d = i2;
        this.e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int iE = com.facebook.imageutils.a.e(bitmap);
        d.a.b.d.i.c(this.a > 0, "No bitmaps registered.");
        long j = iE;
        d.a.b.d.i.d(j <= this.f1259b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iE), Long.valueOf(this.f1259b));
        this.f1259b -= j;
        this.a--;
    }

    public synchronized int b() {
        return this.a;
    }

    public synchronized int c() {
        return this.f1260c;
    }

    public synchronized int d() {
        return this.f1261d;
    }

    public d.a.b.h.h<Bitmap> e() {
        return this.e;
    }

    public synchronized long f() {
        return this.f1259b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int iE = com.facebook.imageutils.a.e(bitmap);
        if (this.a < this.f1260c) {
            long j = iE;
            if (this.f1259b + j <= this.f1261d) {
                this.a++;
                this.f1259b += j;
                return true;
            }
        }
        return false;
    }
}
