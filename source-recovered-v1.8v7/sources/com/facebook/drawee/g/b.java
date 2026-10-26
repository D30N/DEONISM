package com.facebook.drawee.g;

import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.f.p;
import d.a.b.d.i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b {
    public static final p.b s = p.b.f;
    public static final p.b t = p.b.g;
    private Resources a;

    /* renamed from: b, reason: collision with root package name */
    private int f1212b;

    /* renamed from: c, reason: collision with root package name */
    private float f1213c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private Drawable f1214d;

    @Nullable
    private p.b e;

    @Nullable
    private Drawable f;

    @Nullable
    private p.b g;

    @Nullable
    private Drawable h;

    @Nullable
    private p.b i;

    @Nullable
    private Drawable j;

    @Nullable
    private p.b k;

    @Nullable
    private p.b l;

    @Nullable
    private PointF m;

    @Nullable
    private ColorFilter n;

    @Nullable
    private Drawable o;

    @Nullable
    private List<Drawable> p;

    @Nullable
    private Drawable q;

    @Nullable
    private e r;

    public b(Resources resources) {
        this.a = resources;
        t();
    }

    private void J() {
        List<Drawable> list = this.p;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                i.g(it.next());
            }
        }
    }

    private void t() {
        this.f1212b = 300;
        this.f1213c = 0.0f;
        this.f1214d = null;
        p.b bVar = s;
        this.e = bVar;
        this.f = null;
        this.g = bVar;
        this.h = null;
        this.i = bVar;
        this.j = null;
        this.k = bVar;
        this.l = t;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
    }

    public b A(@Nullable Drawable drawable) {
        this.p = drawable == null ? null : Arrays.asList(drawable);
        return this;
    }

    public b B(@Nullable Drawable drawable) {
        this.f1214d = drawable;
        return this;
    }

    public b C(@Nullable p.b bVar) {
        this.e = bVar;
        return this;
    }

    public b D(@Nullable Drawable drawable) {
        if (drawable == null) {
            this.q = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
            this.q = stateListDrawable;
        }
        return this;
    }

    public b E(@Nullable Drawable drawable) {
        this.j = drawable;
        return this;
    }

    public b F(@Nullable p.b bVar) {
        this.k = bVar;
        return this;
    }

    public b G(@Nullable Drawable drawable) {
        this.f = drawable;
        return this;
    }

    public b H(@Nullable p.b bVar) {
        this.g = bVar;
        return this;
    }

    public b I(@Nullable e eVar) {
        this.r = eVar;
        return this;
    }

    public a a() {
        J();
        return new a(this);
    }

    @Nullable
    public ColorFilter b() {
        return this.n;
    }

    @Nullable
    public PointF c() {
        return this.m;
    }

    @Nullable
    public p.b d() {
        return this.l;
    }

    @Nullable
    public Drawable e() {
        return this.o;
    }

    public float f() {
        return this.f1213c;
    }

    public int g() {
        return this.f1212b;
    }

    @Nullable
    public Drawable h() {
        return this.h;
    }

    @Nullable
    public p.b i() {
        return this.i;
    }

    @Nullable
    public List<Drawable> j() {
        return this.p;
    }

    @Nullable
    public Drawable k() {
        return this.f1214d;
    }

    @Nullable
    public p.b l() {
        return this.e;
    }

    @Nullable
    public Drawable m() {
        return this.q;
    }

    @Nullable
    public Drawable n() {
        return this.j;
    }

    @Nullable
    public p.b o() {
        return this.k;
    }

    public Resources p() {
        return this.a;
    }

    @Nullable
    public Drawable q() {
        return this.f;
    }

    @Nullable
    public p.b r() {
        return this.g;
    }

    @Nullable
    public e s() {
        return this.r;
    }

    public b u(@Nullable p.b bVar) {
        this.l = bVar;
        return this;
    }

    public b v(@Nullable Drawable drawable) {
        this.o = drawable;
        return this;
    }

    public b w(float f) {
        this.f1213c = f;
        return this;
    }

    public b x(int i) {
        this.f1212b = i;
        return this;
    }

    public b y(@Nullable Drawable drawable) {
        this.h = drawable;
        return this;
    }

    public b z(@Nullable p.b bVar) {
        this.i = bVar;
        return this;
    }
}
