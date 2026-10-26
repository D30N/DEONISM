package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private float f2114c;
    private d.b.a.b.w.d f;
    private final TextPaint a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final d.b.a.b.w.f f2113b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f2115d = true;
    private WeakReference<b> e = new WeakReference<>(null);

    class a extends d.b.a.b.w.f {
        a() {
        }

        @Override // d.b.a.b.w.f
        public void a(int i) {
            f.this.f2115d = true;
            b bVar = (b) f.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // d.b.a.b.w.f
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            f.this.f2115d = true;
            b bVar = (b) f.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public f(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public d.b.a.b.w.d d() {
        return this.f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.f2115d) {
            return this.f2114c;
        }
        float fC = c(str);
        this.f2114c = fC;
        this.f2115d = false;
        return fC;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(d.b.a.b.w.d dVar, Context context) {
        if (this.f != dVar) {
            this.f = dVar;
            if (dVar != null) {
                dVar.j(context, this.a, this.f2113b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                dVar.i(context, this.a, this.f2113b);
                this.f2115d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.f2115d = z;
    }

    public void j(Context context) {
        this.f.i(context, this.a, this.f2113b);
    }
}
