package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: com.facebook.ads.redexgen.X.Vi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0874Vi extends C6U {
    public ContentResolver A00;
    public DisplayMetrics A01;

    public C0874Vi(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
    }

    public final InterfaceC02616d A0G() {
        return new C0873Vh(this);
    }

    public final InterfaceC02616d A0H() {
        return new C0870Ve(this);
    }

    public final InterfaceC02616d A0I() {
        return new C0871Vf(this);
    }

    public final InterfaceC02616d A0J() {
        return new C0869Vd(this);
    }

    public final InterfaceC02616d A0K() {
        return new C0872Vg(this);
    }
}
